import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int n = scanner.nextInt();
        if (n % 4 == 0) {
            max = n;
        }

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (temp % 4 == 0 && temp > max) {
                max = temp;
            }
        }

        System.out.println(max);

    }
}