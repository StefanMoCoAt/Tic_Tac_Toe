import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = createSpiralMatrix(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] createSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n == 1) {
            matrix[0][0] = 1;
        } else {
            for (int i = 0, a = 0, size; i < n / 2; i++) {
                size = n - i * 2 - 1;
                for (int j = 0, chunk, chIndex, offset; j < 4 * size; j++) {
                    chunk = j / size;
                    chIndex = j % size;
                    offset = n - i - 1;
                    switch (chunk) {
                        case 0:
                            matrix[i][chIndex + i] = a + 1;
                            break;
                        case 1:
                            matrix[chIndex + i][offset] = a + 1;
                            break;
                        case 2:
                            matrix[offset][offset - chIndex] = a + 1;
                            break;
                        case 3:
                            matrix[offset - chIndex][i] = a + 1;
                            break;
                        default:
                            throw new IndexOutOfBoundsException();
                    }
                    a++;
                }
                if (n % 2 == 1) {
                    matrix[n / 2][n / 2] = n * n;
                }
            }
        }
        return matrix;
    }

}