package tictactoe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends InputMismatchException {

    public Main() {
    }

    public static void main(String[] args) {
        char[][] matrix = new char[3][3];
        showMatrix(matrix);
        printMatrix_1(matrix);
        boolean player_X_Playing = true;
        String score = "";
        boolean playing = true;
        while (playing) {
            if (player_X_Playing) {
                player_X(matrix);
                printMatrix_2(matrix);
                player_X_Playing = false;
            } else {
                player_O(matrix);
                printMatrix_2(matrix);
                player_X_Playing = true;
            }
            score = checkWinner(matrix);
            if (score.equals("X wins") || score.equals("O wins") || score.equals("Draw")) {
                playing = false;
            }
        }
        System.out.println(score);
    }

    public static int[] checkInputPlayer() {
        int[] coordinaten = new int[2];
        Scanner player = new Scanner(System.in);
        try {
            coordinaten[0] = player.nextInt();
            coordinaten[1] = player.nextInt();
        } catch (InputMismatchException e) {
            coordinaten[0] = -1;
            coordinaten[1] = -1;
        }
        return coordinaten;
    }

    public static void player_X(char[][] matrix) {
        boolean coordinates = false;
        while (!coordinates) {
            System.out.println("Enter the coordinates: ");
            int[] coordinaten = checkInputPlayer();
            int x = coordinaten[0];
            int y = coordinaten[1];
            if (x > 0 && x <= 3 && y > 0 && y <= 3) {
                if (matrix[x - 1][y - 1] == ' ') {
                    matrix[x - 1][y - 1] = 'X';
                    coordinates = true;
                } else {
                    System.out.println("This cell is occupied another one!");
                }
            } else if (x == -1 || y == -1) {
                System.out.println("You should enter numbers!");
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }
    }

    public static void player_O(char[][] matrix) {
        boolean coordinates = false;
        while (!coordinates) {
            System.out.println("Enter the coordinates: ");
            int[] coordinaten = checkInputPlayer();
            int x = coordinaten[0];
            int y = coordinaten[1];
            if (x > 0 && x <= 3 && y > 0 && y <= 3) {
                if (matrix[x - 1][y - 1] == ' ') {
                    matrix[x - 1][y - 1] = 'O';
                    coordinates = true;
                } else {
                    System.out.println("This cell is occupied another one!");
                }
            } else if (x == -1 || y == -1) {
                System.out.println("You should enter numbers!");
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }
    }

    public static void showMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            Arrays.fill(chars, ' ');
        }
    }

    public static boolean isMatrixFull(char[][] matrix) {
        boolean isFull = false;
        int insert = 0;
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if ('X' == aChar || 'O' == aChar) {
                    insert++;
                }
            }
        }
        if (insert == 9) {
            isFull = true;
        }
        return isFull;
    }

    public static String checkRowCol(char[][] matrix) {
        String checkedRowCol = "";
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ('X' == matrix[i][(j - 1 + 3) % 3] && 'X' == matrix[i][(j + 1 + 3) % 3] && 'X' == matrix[i][j]) {
                    temp.append("X");
                } else if ('O' == matrix[i][(j - 1 + 3) % 3] && 'O' == matrix[i][(j + 1 + 3) % 3] && 'O' == matrix[i][j]) {
                    temp.append("O");
                } else if ('X' == matrix[(i - 1 + 3) % 3][j] && 'X' == matrix[(i + 1 + 3) % 3][j] && 'X' == matrix[i][j]) {
                    temp.append("X");
                } else if ('O' == matrix[(i - 1 + 3) % 3][j] && 'O' == matrix[(i + 1 + 3) % 3][j] && 'O' == matrix[i][j]) {
                    temp.append("O");
                }
            }
        }
        switch (temp.toString()) {
            case "XXX":
                checkedRowCol = "X";
                break;
            case "OOO":
                checkedRowCol = "O";
                break;
            case "OXOXOX":
            case "XOXOXO":
                checkedRowCol = "F";
                break;
        }
        return checkedRowCol;
    }

    public static String checkDiagonal(char[][] matrix) {
        String checkedDia;
        StringBuilder tempUpDown = new StringBuilder();
        StringBuilder tempDownUp = new StringBuilder();

        for (int i = 0, j = 2; i < matrix.length; i++, j--) {
            tempDownUp.append(matrix[i][j]);
        }

        for (int i = 0; i < matrix.length; i++) {
            tempUpDown.append(matrix[i][i]);
        }

        if ("XXX".equals(tempUpDown.toString()) || "XXX".equals(tempDownUp.toString())) {
            checkedDia = "X";
        } else if ("OOO".equals(tempUpDown.toString()) || "OOO".equals(tempDownUp.toString())) {
            checkedDia = "O";
        } else {
            checkedDia = "F";
        }
        return checkedDia;
    }

    public static void printMatrix_1(char[][] matrix) {
        String printMatrix = "---------\n" +
                "| " + matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2] + " |\n" +
                "| " + matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2] + " |\n" +
                "| " + matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2] + " |\n" +
                "---------";
        System.out.println(printMatrix);
    }

    public static void printMatrix_2(char[][] matrix) {
        String printMatrix = "---------\n" +
                "| " + matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2] + " |\n" +
                "| " + matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2] + " |\n" +
                "| " + matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2] + " |\n" +
                "---------";
        System.out.println(printMatrix);
    }

    public static String checkWinner(char[][] matrix) {
        String output = "";
        if ("X".equals(checkRowCol(matrix)) || "X".equals(checkDiagonal(matrix))) {
            output = "X wins";
        } else if ("O".equals(checkRowCol(matrix)) || "O".equals(checkDiagonal(matrix))) {
            output = "O wins";
        } else if (isMatrixFull(matrix)) {
            output = "Draw";
        } else if (!isMatrixFull(matrix) && !"F".equals(checkRowCol(matrix))) {
            output = "Game not finished";
        } else if ("F".equals(checkRowCol(matrix))) {
            output = "Impossible";
        }
        return output;
    }
}
