import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int largest = 0;
        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            } else if (input > largest) {
                largest = input;
            }
        }
        System.out.println(largest);
    }
}