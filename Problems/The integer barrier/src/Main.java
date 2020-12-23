import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int barrier = 1000;
        int sum = 0;
        while (true) {
            int input = scanner.nextInt();
            sum += input;
            if (input == 0) {
                break;
            }
            if (sum >= barrier) {
                sum -= barrier;
                break;
            }
        }
        scanner.close();

        System.out.println(sum);
    }
}