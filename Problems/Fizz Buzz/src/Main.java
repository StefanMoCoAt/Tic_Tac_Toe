import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a <= b) {
            String out = "";
            if (a % 3 == 0) {
                out += "Fizz";
            }
            if (a % 5 == 0) {
                out += "Buzz";
            }
            if (a % 3 != 0 && a % 5 != 0) {
                out += String.valueOf(a);
            }
            System.out.println(out);
            ++a;
        }

    }
}