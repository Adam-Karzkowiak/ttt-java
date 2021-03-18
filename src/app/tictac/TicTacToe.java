package app.tictac;

import app.tictac.conditions.PlayerWiningCondition;
import app.tictac.moves.AIMove;
import app.tictac.moves.PlayerMove;

import java.util.ArrayList;

import static app.tictac.global.GlobalConstants.BOARD;

class TicTacToe {
    private static int numberOfMoves = 0;
    private static ArrayList<Integer> usedNumbers = new ArrayList<>();


    private static void printBoard() {
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD.length; j++) {
                System.out.print(BOARD[i][j]);
            }
            System.out.println();
        }
    }


    public static void playAGame() throws InterruptedException {
        boolean endOfAGame = false;
        while (!endOfAGame && numberOfMoves < 10) {
            printBoard();
            PlayerMove.move( usedNumbers, numberOfMoves);
            Thread.sleep(1000);
            printBoard();
            AIMove.move(BOARD, usedNumbers, numberOfMoves);
            Thread.sleep(1000);
            endOfAGame = PlayerWiningCondition.winingConditionPlayer(BOARD);
        }

    }


    public static void main(String[] args) throws InterruptedException {
        playAGame();
    }
}
