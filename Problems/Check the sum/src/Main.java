import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();

        int sum = 20;

        boolean anser = numA + numB == sum || numB + numC == sum || numA + numC == sum;

        System.out.println(anser);

    }
}