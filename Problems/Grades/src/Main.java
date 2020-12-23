import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = 0; // 2
        int c = 0; // 3
        int b = 0; // 4
        int a = 0; // 5

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int grad = scanner.nextInt();
            switch (grad) {
                case 2:
                    d++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    b++;
                    break;
                case 5:
                    a++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);

    }
}