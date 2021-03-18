package app.tictac.moves;

import app.tictac.conditions.PlayerWiningCondition;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerMove {
    public static void move(char[][] board, ArrayList<Integer>usedNumbers,int numberOfMoves) {
        Scanner scanner = new Scanner(System.in);
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
        PlayerWiningCondition.winingConditionPlayer(board);
        usedNumbers.add(move);
        numberOfMoves++;
    }

}
