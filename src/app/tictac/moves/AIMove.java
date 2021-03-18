package app.tictac.moves;

import java.util.ArrayList;
import java.util.Random;

public class AIMove {
    public static void move(char[][] BOARD, ArrayList<Integer> usedNumbers, int numberOfMoves) {
        Random random = new Random();
        int move = random.nextInt(9) + 1;
        if (!usedNumbers.contains(move)) {
            if (move == 1) {
                BOARD[0][0] = 'O';
            }
            if (move == 2) {
                BOARD[0][2] = 'O';
            }
            if (move == 3) {
                BOARD[0][4] = 'O';
            }
            if (move == 4) {
                BOARD[2][0] = 'O';
            }
            if (move == 5) {
                BOARD[2][2] = 'O';
            }
            if (move == 6) {
                BOARD[2][4] = 'O';
            }
            if (move == 7) {
                BOARD[4][0] = 'O';
            }
            if (move == 8) {
                BOARD[4][2] = 'O';
            }
            if (move == 9) {
                BOARD[4][4] = 'O';
            }
            numberOfMoves++;
            usedNumbers.add(move);
        }
    }
}
