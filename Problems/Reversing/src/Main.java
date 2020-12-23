import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int zwErgeb = scanner.nextInt();
        int zaehler = 0;
        int faktorZehn = 1;
        int umgedrehteZahl = 0;

        while (zwErgeb != 0) {
            zwErgeb = zwErgeb / 10;
            zaehler++;
        }

        for (int i = 1; i < zaehler; i++) {
            faktorZehn = faktorZehn * 10;
        }

        while (zwErgeb != 0) {
            umgedrehteZahl = (zwErgeb % 10) * faktorZehn + umgedrehteZahl;
            zwErgeb = zwErgeb / 10;
            faktorZehn = faktorZehn / 10;
        }
        System.out.println(umgedrehteZahl);
    }
}