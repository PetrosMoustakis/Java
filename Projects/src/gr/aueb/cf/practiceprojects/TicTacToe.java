package gr.aueb.cf.practiceprojects;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Player 1 enter your name");
        String p1 = in.nextLine();
        System.out.println("Player 2 enter your name");
        String p2 = in.nextLine();

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        boolean isPlayer1 = true;
        boolean gameEnded = false;

        while (!gameEnded) {

            printBoard(board);

            char symbol ;
            if (isPlayer1) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }

            if (isPlayer1) {
                System.out.println(p1 + "'s turn (x):");
            } else {
                System.out.println(p2 + "'s turn (0)");
            }

            int row;
            int col;

            while (true) {
                System.out.println("Enter a row (1, 2 or 3) : ");
                row = in.nextInt();
                System.out.println("Enter a column (1, 2 or 3) : ");
                col = in.nextInt();

                if (row < 1 || col < 1 || row > 3 || col > 3) {
                    System.out.println("Your choices are out of bounds");
                } else if (board[row-1][col-1] != '-') {
                    System.out.println("Someone has already made a move there");
                } else {
                    break;
                }
            }

            board[row-1][col-1] = symbol;

            if (hasWon(board) == 'X') {
                System.out.println(p1 + " has won!");
                gameEnded = true;
            } else if (hasWon(board) == 'O') {
                System.out.println(p2 + " has won!");
                gameEnded = true;
            } else if (hasTied(board)) {
                System.out.println("It's a tie");
                gameEnded = true;
            } else {
                isPlayer1 = !isPlayer1;
            }
        }

    }

    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

        public static char hasWon(char[][] a) {

            for (int i = 0 ; i < 3;  i++) {
                if (a[i][0] == a[i][1] && a[i][1] == a[i][2] && a[i][0] != '-' ) {
                    return a[i][0];
                }
            }

            for (int j = 0; j < 3; j++) {
                if (a[0][j] == a[1][j] && a[1][j] == a[2][j] && a[0][j] != '-' ) {
                    return a[0][j];
                }
            }

            if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[0][0]!='-') {
                return a[0][0];
            }

            if (a[2][0] == a[1][1] && a[1][1] == a[0][2] && a[2][0]!='-') {
                return a[2][0];
            }
            return '-';
        }

        public static boolean hasTied(char[][] a) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (a[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }
}

