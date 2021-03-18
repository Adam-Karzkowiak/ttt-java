package app.tictac.moves;

import java.util.ArrayList;
import java.util.Random;

public class AIMove {
    public static void move(char[][] board, ArrayList<Integer> usedNumbers, int numberOfMoves) {
        Random random = new Random();
        int move = random.nextInt(9) + 1;
        if (!usedNumbers.contains(move)) {
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
            numberOfMoves++;
            usedNumbers.add(move);
        }
    }
}
