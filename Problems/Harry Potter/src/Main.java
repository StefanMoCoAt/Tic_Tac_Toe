import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String output;

        switch (input) {
            case "gryffindor":
                output = "bravery";
                break;
            case "hufflepuff":
                output = "loyalty";
                break;
            case "slytherin":
                output = "cunning";
                break;
            case "ravenclaw":
                output = "intellect";
                break;
            default:
                output = "not a valid house";
                break;
        }

        System.out.println(output);

    }
}