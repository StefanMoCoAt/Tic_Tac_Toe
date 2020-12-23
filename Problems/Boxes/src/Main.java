import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] box1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] box2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        int[] sortBox1 = sortUp(box1);
        int[] sortBox2 = sortUp(box2);

        String answer = "Incompatible";
        if (sortBox1[0] < sortBox2[0] && sortBox1[1] < sortBox2[1] && sortBox1[2] < sortBox2[2]) {
            answer = "Box 1 < Box 2";
        }
        if (sortBox1[0] > sortBox2[0] && sortBox1[1] > sortBox2[1] && sortBox1[2] > sortBox2[2]) {
            answer = "Box 1 > Box 2";
        }

        System.out.println(answer);

    }

    static int[] sortUp(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - 1; j++) {
                int temp = 0;
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        return intArray;
    }

}