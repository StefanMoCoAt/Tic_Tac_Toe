import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        int num = 1;
        int i = 1;
        long factorial = 1;
        while (i <= num) {
            if (!(factorial > m)) {
                factorial *= i;
                i++;
                num++;
            } else {
                break;
            }
        }
        System.out.print(i - 1);

    }

}