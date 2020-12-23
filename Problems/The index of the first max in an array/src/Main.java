import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0;
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }
}