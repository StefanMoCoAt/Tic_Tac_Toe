import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[scanner.nextInt()];
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            int next = scanner.nextInt();
            input[i] = next;
            sum += next;
        }
        System.out.println(sum);
    }
}