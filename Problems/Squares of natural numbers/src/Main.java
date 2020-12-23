import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        int sq = 1;
        while (sq <= n) {
            System.out.println(sq);
            sq = i * i;
            ++i;
        }

    }
}