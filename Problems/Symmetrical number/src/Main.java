import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }

    }
}