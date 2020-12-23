import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int answer = 0;

        if (a > 0 && a <= 10_000) {
            if (a % 2 == 0) {
                answer = a + 2;
            } else {
                answer = a + 1;
            }
        }

        System.out.println(answer);

    }
}