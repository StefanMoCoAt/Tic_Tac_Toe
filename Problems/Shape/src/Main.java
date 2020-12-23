import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String chosen = "";
        String noShape = "";
        switch (scan.nextInt()) {
            case 1:
                chosen = "square";
                break;
            case 2:
                chosen = "circle";
                break;
            case 3:
                chosen = "triangle";
                break;
            case 4:
                chosen = "rhombus";
                break;
            default:
                noShape = "There is no such shape!";
                break;
        }
        System.out.print(!chosen.isEmpty() ? "You have chosen a " + chosen : noShape);
    }
}