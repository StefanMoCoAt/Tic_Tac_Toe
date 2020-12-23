import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int klasOne = scanner.nextInt();
        int klasTwo = scanner.nextInt();
        int klasThree = scanner.nextInt();
        float studentDesk = 2;

        int desksKlasOne = (int) Math.ceil(klasOne / studentDesk);
        int desksklasTwo = (int) Math.ceil(klasTwo / studentDesk);
        int desksklasThree = (int) Math.ceil(klasThree / studentDesk);

        int deskAll = desksKlasOne + desksklasTwo + desksklasThree;

        System.out.println(deskAll);




    }


}