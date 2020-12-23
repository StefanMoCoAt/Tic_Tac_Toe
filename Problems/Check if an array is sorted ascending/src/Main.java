import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            input[i] = array[i];
        }

        Arrays.sort(array);

        System.out.println(Arrays.compare(input, array) == 0);

    }
}