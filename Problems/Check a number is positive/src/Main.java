import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String answer = "NO";

        if (number > 0) {
            answer = "YES";
        }

        System.out.println(answer);

    }
}