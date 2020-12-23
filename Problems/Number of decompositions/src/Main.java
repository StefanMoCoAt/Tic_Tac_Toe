import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        partition(n, n, "");
    }

    public static void partition(int max, int n, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
        }
        for (int i = 1; i <= Math.min(max, n); i++) {
            partition(i, n - i, prefix + " " + i);
        }

    }
}