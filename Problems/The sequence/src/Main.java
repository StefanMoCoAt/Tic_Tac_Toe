import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loops = scanner.nextInt();
        int i = 0;
        int answer = 0;

        while (i < loops) {
            i++;
            int element = scanner.nextInt();
            if (element % 4 == 0 && answer < element) {
                answer = element;
            }
        }

        System.out.println(answer);

    }
}