import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean numA = scanner.nextInt() > 0;
        boolean numB = scanner.nextInt() > 0;
        boolean numC = scanner.nextInt() > 0;

        boolean answer = false;

        if (numA && !numB && !numC) {
            answer = true;
        } else if (!numA && numB && !numC) {
            answer = true;
        } else if (!numA && !numB && numC) {
            answer = true;
        }

        System.out.println(answer);

    }
}