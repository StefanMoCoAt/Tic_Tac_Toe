import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int eingabe1Stunden = scanner.nextInt();
            int sec1Stunden = eingabe1Stunden * 3600;
        int eingabe1Minunten = scanner.nextInt();
            int sec1Minuten = eingabe1Minunten * 60;
        int eingaben1Sekunden = scanner.nextInt();
            int sec1Sekunden = eingaben1Sekunden;

        int sekunden1 = sec1Stunden + sec1Minuten + sec1Sekunden;

        int eingabe2Stunden = scanner.nextInt();
        int sec2Stunden = eingabe2Stunden * 3600;
        int eingabe2Minunten = scanner.nextInt();
        int sec2Minuten = eingabe2Minunten * 60;
        int eingaben2Sekunden = scanner.nextInt();
        int sec2Sekunden = eingaben2Sekunden;

        int sekunden2 = sec2Stunden + sec2Minuten + sec2Sekunden;

        int result = sekunden2 - sekunden1;

        System.out.println(result);

    }
}