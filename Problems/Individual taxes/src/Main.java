import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] incomes = new double[n];
        int[] taxRat = new int[n];
        double[] taxN = new double[n];
        double taxNmax = 0;
        int maxN = 0;

        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            taxRat[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            taxN[i] = incomes[i] / 100 * taxRat[i];
            if (taxN[i] > taxNmax) {
                taxNmax = taxN[i];
                maxN = i + 1;
            }
        }

        System.out.println(maxN);

    }
}