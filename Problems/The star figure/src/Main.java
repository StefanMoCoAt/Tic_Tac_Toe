import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] matrix = new char[n][n];
        int maxIndex = n - 1;
        int centerIndex = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j | i == centerIndex | j == centerIndex | maxIndex == i + j) {
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = '.';
                }
            }
        }

        for (char[] a : matrix) {
            for (char i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}