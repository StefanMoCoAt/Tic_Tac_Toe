import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int units = scanner.nextInt();
        String category = null;

        if (units < 1) {
            category = "no army";
        } else if (units <= 19) {
            category = "pack";
        } else if (units <= 249) {
            category = "throng";
        } else if (units <= 999) {
            category = "zounds";
        } else {
            category = "legion";
        }

        System.out.println(category);

    }
}