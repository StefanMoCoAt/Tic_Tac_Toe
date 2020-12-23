import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bridges = scanner.nextInt();
        int[] heightsBridges = new int[bridges];
        for (int i = 0; i < heightsBridges.length; i++) {
            heightsBridges[i] = scanner.nextInt();
        }

        String answerNoCrash = "Will not crash";
        String answerWillCrashOn = "Will crash on bridge ";
        String result = "";
        for (int i = 0; i < heightsBridges.length; i++) {
            if (n >= heightsBridges[i]) {
                result = answerWillCrashOn + (i + 1);
                break;
            } else {
                result = answerNoCrash;
            }
        }
        System.out.println(result);

    }
}