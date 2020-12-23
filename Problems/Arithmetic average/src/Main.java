import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int totalNum3 = 0;
        double sum3 = 0;

        for (; a <= b; a++) {
            if (a % 3 == 0) {
                totalNum3++;
                sum3 += a;
            }
        }

        System.out.println(sum3 / totalNum3);

    }
}