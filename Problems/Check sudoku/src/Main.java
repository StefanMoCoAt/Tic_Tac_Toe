import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n * n;
        int[][] sudoku = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sudoku[i][j] = sc.nextInt();
            }
        }

        int sumToCheck = sumToCheck(n);
        boolean row = checkRows(sudoku, size, n, sumToCheck);
        boolean col = checkColumns(sudoku, size, n, sumToCheck);
        boolean squ = checkSquares(sudoku, size, n, sumToCheck);

        System.out.println(sudokuSolved(row, col, squ));

    }

    public static int sumToCheck(int n) {
        int sum = 0;
        for (int i = 0; i <= n * n; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean checkRows(int[][] sudoku, int size, int n, int sumToCheck) {
        boolean row = false;
        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += sudoku[i][j];
            }
            if (rowSum % n == 0 && rowSum == sumToCheck) {
                row = true;
            } else {
                break;
            }
        }
        return row;
    }

    public static boolean checkColumns(int[][] sudoku, int size, int n, int sumToCheck) {
        boolean col = false;
        for (int i = 0; i < size; i++) {
            int colSum = 0;
            for (int j = 0; j < size; j++) {
                colSum += sudoku[j][i];
            }
            if (colSum % n == 0 && colSum == sumToCheck) {
                col = true;
            } else {
                break;
            }
        }
        return col;
    }

    public static boolean checkSquares(int[][] sudoku, int size, int n, int sumToCheck) {
        boolean squ = false;
        int countRow = 0;
        while (countRow < size) { // start while1
            int countCol = 0;
            while (countCol < size) { // start while2
                int squSum = 0;
                for (int i = countRow; i < n + countRow; i++) { // start Loop Row
                    for (int j = countCol; j < n + countCol; j++) { // start Loop Col
                        squSum += sudoku[i][j];
                    } // end Loop Col
                } // end Loop Row
                if (squSum % n == 0 && squSum == sumToCheck) {
                    squ = true;
                } else {
                    break;
                }
                countCol += n;
            } // end while2
            countRow += n;
        } // end while1
        return squ;
    }

    public static String sudokuSolved(boolean row, boolean col, boolean squ) {
        String answer = "";
        if (row && col && squ) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }

}