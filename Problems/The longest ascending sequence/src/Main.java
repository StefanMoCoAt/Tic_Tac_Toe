import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int count = 1;
        int countMax = 1;
        for (int i = 0; i < size - 1; i++) {

            if (array[i + 1] > array[i]) {
                count++;
                if (countMax < count) {
                    countMax = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(countMax);

    }
}