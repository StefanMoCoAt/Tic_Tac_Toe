import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String str = scanner.nextLine();

        int length = str.length();

        int count = 0;
        int startIndex = 0;

        Pattern pattern = Pattern.compile(str, Pattern.LITERAL);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find(startIndex)) {
            count++;
            startIndex = matcher.start() + length;
        }

        System.out.println(count);

    }
}