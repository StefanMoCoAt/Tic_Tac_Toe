import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>();

        int indexWords = 0;
        do {
            words.add(scanner.next());
            indexWords++;
        } while (indexWords <= 3);

        scanner.close();

        for (String word : words) {
            System.out.println(word);
        }
    }
}