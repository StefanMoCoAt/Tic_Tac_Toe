import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean result = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                result = false;
                break;
            }
            if (array[i] == m && array[i + 1] == n) {
                result = false;
                break;
            }
        }

        System.out.println(result);

    }
}