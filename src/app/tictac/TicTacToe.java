package app.tictac;

import app.tictac.conditions.PlayerWiningCondition;
import app.tictac.moves.AIMove;
import app.tictac.moves.PlayerMove;

import java.util.ArrayList;

class TicTacToe {
    private static int numberOfMoves = 0;
    private static ArrayList<Integer> usedNumbers = new ArrayList<>();
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


    public static void playAGame() throws InterruptedException {
        boolean endOfAGame = false;
        while (!endOfAGame && numberOfMoves < 10) {
            printBoard(board);
            PlayerMove.move(board, usedNumbers, numberOfMoves);
            Thread.sleep(1000);
            printBoard(board);
            AIMove.move(board, usedNumbers, numberOfMoves);
            Thread.sleep(1000);
            endOfAGame = PlayerWiningCondition.winingConditionPlayer(board);
        }

    }


    public static void main(String[] args) throws InterruptedException {
        playAGame();
    }
}
