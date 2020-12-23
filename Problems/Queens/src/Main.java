import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        String answer = "NO";

        if (x1 == x2 || y1 == y2) {
            answer = "YES";
        }
        if (x1 == x2 || y1 == y2) {
            answer = "YES";
        }
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            answer = "YES";
        }

        System.out.println(answer);
    }
}