import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        System.out.println(isSorted(input));

    }

    public static boolean isSorted(String[] input) {
        boolean isSorted = true;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].compareTo(input[i + 1]) > 0) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

}