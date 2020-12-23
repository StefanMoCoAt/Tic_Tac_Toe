import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array2D = new int[n][n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                array2D[y][x] = Math.abs(x - y);
            }
        }
        for (int[] y : array2D) {
            for (int x : y) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}