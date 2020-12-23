import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] cinema = createCinema(n, m, sc);
        int k = sc.nextInt();
        System.out.println(seatsAvailable(cinema, n, m, k));
    }

    public static int[][] createCinema(int n, int m, Scanner sc) {
        int[][] cinema = null;
        if (n > 0 && n < 21 && m > 0 && m < 21) {
            cinema = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    cinema[i][j] = sc.nextInt();
                }
            }
        }
        return cinema;
    }

    public static String seatsAvailable(int[][] cinema, int n, int m, int k) {
        String answer = "";
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int line = 0;
            for (int j = 0; j < m; j++) {
                assert cinema != null;
                if (cinema[i][j] == 0) {
                    counter++;
                    if (counter == k && m == k) {
                        line = i + 1;
                    } else if (counter == k) {
                        boolean inReihenfolge = false;
                        int wcount = 0;
                        while (wcount < k) {
                            if (cinema[i][j - wcount] == 0) {
                                inReihenfolge = true;
                            } else {
                                inReihenfolge = false;
                                counter = 0;
                            }
                            wcount++;
                        }
                        if (inReihenfolge) {
                            line = i + 1;
                        }
                    }
                } else {
                    counter = 0;
                }
            }
            counter = 0;
            if (line != 0) {
                answer += line + " ";
                break;
            }
        }
        if (" ".equals(answer) || Objects.requireNonNull(answer).length() == 0) {
            return String.valueOf(0);
        } else {
            return answer;
        }
    }

}