import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sequenceLength = input.length();
        int sumC = 0;
        int sumG = 0;
        Pattern patternC = Pattern.compile("c", Pattern.CASE_INSENSITIVE);
        Matcher matcherC = patternC.matcher(input);
        Pattern patternG = Pattern.compile("g", Pattern.CASE_INSENSITIVE);
        Matcher matcherG = patternG.matcher(input);
        while (matcherC.find()) {
            sumC++;
        }
        while (matcherG.find()) {
            sumG++;
        }
        System.out.println((double) (sumC + sumG) / sequenceLength * 100);
    }
}