import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();

        boolean answer = false;

        if (numA >= numB && numA <= numC) {
            answer = true;
        } else if (numA <= numB && numA >= numC) {
            answer = true;
        }

        System.out.println(answer);


    }
}