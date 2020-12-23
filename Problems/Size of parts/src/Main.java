import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shipped = 0;    // input 0
        int fixed = 0;      // input 1
        int rejects = 0;    // input -1

        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            int n = scanner.nextInt();
            if (n == 0) {
                shipped++;
            }
            if (n == 1) {
                fixed++;
            }
            if (n == -1) {
                rejects++;
            }
        }

        System.out.println(shipped + " " + fixed + " " + rejects);

    }
}