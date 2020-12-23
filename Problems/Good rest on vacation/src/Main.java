import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int aufenthaltsdauer = scanner.nextInt();
        int speisekosten = scanner.nextInt() * aufenthaltsdauer;
        int flugkostenOneway = scanner.nextInt() * 2;
        int hotelkosten = scanner.nextInt() * (aufenthaltsdauer-1);

        int gesammtKosten = speisekosten + flugkostenOneway + hotelkosten;

        System.out.println(gesammtKosten);



    }
}