import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reeses = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean answer = false;

        if (reeses >= 10 && reeses <= 20 && !weekend) {
            answer = true;
        } else if (reeses >= 15 && reeses <= 25 && weekend) {
            answer = true;
        }

        System.out.println(answer);

    }
}