import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        String[] words = new String[5];
        int word = 0;
        do {
            words[word] = scan.next();
            word++;
        } while (word < words.length);
        scan.close();

        System.out.println("The form for " + words[0] + " is completed. We will contact" +
                " you if we need a chef that cooks " + words[4] + " dishes.");
    }
}