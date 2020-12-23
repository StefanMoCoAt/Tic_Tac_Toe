import java.util.Scanner;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int roots = 3;

        for (int x = 1; x <= 1_000; x++) {
            //  a * x^3 + b * x^2 + c * x + d = 0
            if (a * pow(x, 3) + b * pow(x, 2) + c * x + d == 0) {
                System.out.println(x);
                roots--;
            }
            if (roots == 0) {
                break;
            }
        }

    }
}