package app.tictac;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    private static final Scanner scanner = new Scanner(System.in);
    private static final char[][] board = {{' ', '|', ' ', '|', ' '},
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


    private static void playerMove(char[][] board) {
        int move = scanner.nextInt();
        if (move == 1) {
            board[0][0] = 'X';
        }
        if (move == 2) {
            board[0][2] = 'X';
        }
        if (move == 3) {
            board[0][4] = 'X';
        }
        if (move == 4) {
            board[2][0] = 'X';
        }
        if (move == 5) {
            board[2][2] = 'X';
        }
        if (move == 6) {
            board[2][4] = 'X';
        }
        if (move == 7) {
            board[4][0] = 'X';
        }
        if (move == 8) {
            board[4][2] = 'X';
        }
        if (move == 9) {
            board[4][4] = 'X';
        }
    }

    private static void aiMove(char[][] board) {
        Random random = new Random();
        int move = random.nextInt(9) + 1;
        if (move == 1) {
            board[0][0] = 'O';
        }
        if (move == 2) {
            board[0][2] = 'O';
        }
        if (move == 3) {
            board[0][4] = 'O';
        }
        if (move == 4) {
            board[2][0] = 'O';
        }
        if (move == 5) {
            board[2][2] = 'O';
        }
        if (move == 6) {
            board[2][4] = 'O';
        }
        if (move == 7) {
            board[4][0] = 'O';
        }
        if (move == 8) {
            board[4][2] = 'O';
        }
        if (move == 9) {
            board[4][4] = 'O';
        }
    }

    public static void main(String[] args) {
        printBoard(board);
        playerMove(board);
        printBoard(board);
        aiMove(board);
        printBoard(board);
    }
}
