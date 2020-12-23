import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = buildToEnd(sc, new StringBuilder());
        int[][] array = create2DIntArray(input);
        // out
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int sizeI = array.length;
                int sizeJ = array[i].length;
                int sum =   array[(i - 1 + sizeI) % sizeI][j] + // i - 1, j
                            array[(i + 1 + sizeI) % sizeI][j] + // i + 1, j
                            array[i][(j - 1 + sizeJ) % sizeJ] + // i, j - 1
                            array[i][(j + 1 + sizeJ) % sizeJ];  // i, j + 1
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static StringBuilder buildToEnd(Scanner sc, StringBuilder input) {
        while (sc.hasNextLine()) {
            String temp = sc.nextLine();
            if ("end".equals(temp)) {
                break;
            } else {
                input.append(temp).append("|");                 // row break = "|"
            }
        }
        return input;
    }

    public static int[][] create2DIntArray(StringBuilder input) {
        String[] in = input.toString().split("\\|", 0);
        int size = in.length;                                   // row = size
        String[][] stringArray = new String[size][];
        int[][] intArray = new int[size][];
        for (int i = 0; i < size; i++) {
            stringArray[i] = in[i].split(" ", 0);   // fill stringArray
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                intArray[i] = new int[stringArray[i].length];  // intArray vector init
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < intArray[i].length; j++) {     // fill intArray
                intArray[i][j] = Integer.parseInt(stringArray[i][j]);
            }
        }
        return intArray;
    }

}