import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float m = scanner.nextFloat();
        float p = scanner.nextFloat();
        float k = scanner.nextFloat();

        int j = 0;
        while (m < k) {
            m += m / 100 * p;
            j++;
        }
        System.out.println(j);
    }
}