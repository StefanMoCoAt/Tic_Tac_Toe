import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "";

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input % 2 == 0) {
                answer += "even\n";
            } else {
                answer += "odd\n";
            }
        }
        System.out.println(answer);

    }
}