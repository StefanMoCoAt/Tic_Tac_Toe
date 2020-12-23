import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.length() == 3) {
            int first = Integer.parseInt(String.valueOf(input.charAt(0)));
            int second = Integer.parseInt(String.valueOf(input.charAt(1)));
            int third = Integer.parseInt(String.valueOf(input.charAt(2)));
            System.out.println(first + second + third);
        }
    }
}