import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int pieces = n * m;

        String answer = "NO";

        if (!(k > pieces)) {
            for (int mp = 1; mp < (m + 1); mp++) {
                if (mp * n == k) {
                    answer = "YES";
                    break;
                }
            }

            for (int np = 1; np < (n + 1); np++) {
                if (np * m == k) {
                    answer = "YES";
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}