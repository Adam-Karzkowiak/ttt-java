package app.tictac.moves;

import app.tictac.conditions.PlayerWiningCondition;

import java.util.ArrayList;
import java.util.Scanner;

import static app.tictac.global.GlobalConstants.BOARD;

public class PlayerMove {
    public static void move(ArrayList<Integer>usedNumbers,int numberOfMoves) {
        Scanner scanner = new Scanner(System.in);
        int move = scanner.nextInt();
        if (move == 1) {
            BOARD[0][0] = 'X';
        }
        if (move == 2) {
            BOARD[0][2] = 'X';
        }
        if (move == 3) {
            BOARD[0][4] = 'X';
        }
        if (move == 4) {
            BOARD[2][0] = 'X';
        }
        if (move == 5) {
            BOARD[2][2] = 'X';
        }
        if (move == 6) {
            BOARD[2][4] = 'X';
        }
        if (move == 7) {
            BOARD[4][0] = 'X';
        }
        if (move == 8) {
            BOARD[4][2] = 'X';
        }
        if (move == 9) {
            BOARD[4][4] = 'X';
        }
        PlayerWiningCondition.winingConditionPlayer(BOARD);
        usedNumbers.add(move);
        numberOfMoves++;
    }

}
