import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loops = scanner.nextInt();
        int number = 0;
        int sumDiv6 = 0;

        for (int i = 0; i < loops; i++) {
            number = scanner.nextInt();
            if (number % 6 == 0) {
                sumDiv6 += number;
            }
        }

        System.out.println(sumDiv6);

    }
}