import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float year = scanner.nextInt();

        if (year > 1900 && year < 3000 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }

    }
}