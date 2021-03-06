package app.tictac;

import java.util.Scanner;

class TicTacToe {
    private static Scanner scanner = new Scanner(System.in);
    private static char[][] board = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
//        [00],[02],[04]
//        [20],[22],[24]
//        [40],[42],[44]

    public static void main(String[] args) {
        printBoard(board);
        int player =scanner.nextInt();

        printBoard(board);
    }
}
