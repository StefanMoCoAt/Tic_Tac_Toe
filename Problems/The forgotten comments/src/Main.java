/**
 * The restriction: the class should have the name Main
 */

public class Main {
    /*
    The start point of your program
     */
    public static void main(String[] args) {

        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
    }
}