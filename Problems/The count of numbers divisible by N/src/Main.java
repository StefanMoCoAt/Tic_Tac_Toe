import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int count = 0;

        for (; a <= b; a++) {
            if (a % c == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
