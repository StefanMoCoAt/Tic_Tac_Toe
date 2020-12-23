import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        String less = "Deficiency";
        String more = "Excess";
        String fit = "Normal";

        String answer = "";

        if (a <= b && b <= 24) {
            if (h >= a && h <= b) {
                answer = fit;
            } else if (h > b) {
                answer = more;
            } else {
                answer = less;
            }
        }

        System.out.println(answer);

    }
}