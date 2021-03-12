package app.tictac.conditions;

public class PlayerWiningCondition {
    public static boolean winingConditionPlayer(char[][] board) {
        String won = "Player won!";
        if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][4] == 'X') {
            System.out.println(won);
            return true;
        } else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][4] == 'X') {
            System.out.println(won);
            return true;
        } else if (board[4][0] == 'X' && board[4][2] == 'X' && board[4][4] == 'X') {
            System.out.println(won);
            return true;
        } else if (board[0][0] == 'X' && board[2][2] == 'X' && board[4][4] == 'X') {
            System.out.println(won);
            return true;
        } else if (board[0][4] == 'X' && board[2][2] == 'X' && board[4][0] == 'X') {
            System.out.println(won);
            return true;
        } else if (board[0][0] == 'X' && board[2][0] == 'X' && board[4][0] == 'X') {
            System.out.println(won);
            return true;
        } else if (board[0][2] == 'X' && board[2][2] == 'X' && board[4][2] == 'X') {
            System.out.println(won);
            return true;
        } else if (board[0][4] == 'X' && board[2][4] == 'X' && board[4][4] == 'X') {
            System.out.println(won);
            return true;
        }
        return false;
    }
}
