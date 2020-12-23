import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        boolean cde = true;
        boolean hag = true;
        a = scanner.nextInt();
        while (a == 0) {
            a = scanner.nextInt();
        }
        while (true) {
            b = scanner.nextInt();
            if (b == 0) {
                break;
            }
            hag = hag && a >= b;
            cde = cde && a <= b;
            if (!cde && !hag) {
                break;
            }
            a = b;
        }
        System.out.println(cde || hag);
    }
}