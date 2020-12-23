import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String answer = "False";

        if (-15 < a && a <= 12 || 14 < a && a < 17 || 19 <= a) {
            answer = "True";
        }

        System.out.println(answer);

    }
}