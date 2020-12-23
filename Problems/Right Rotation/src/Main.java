import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputLine = sc.nextLine().split(" ");
        int[] array = new int[inputLine.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(inputLine[i]);
        }
        int cycle = sc.nextInt() % array.length;
        while (cycle > 0) {
            int temp;
            for (int i = array.length - 1; i > 0; i--) {
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            cycle--;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}