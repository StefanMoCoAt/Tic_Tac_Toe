import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>();

        int indexWords = 0;
        do {
            words.add(scanner.next());
            indexWords++;
        } while (indexWords <= 2);

        scanner.close();

        ListIterator<String> listIterator = words.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}