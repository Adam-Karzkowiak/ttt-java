package app.tictac.conditions;

class AIWiningCondition {
    public static boolean winingConditionAI(char[][] board) {
        String won = "Player won!";
        if (board[0][0] == 'O' && board[0][2] == 'O' && board[0][4] == 'O') {
            System.out.println(won);
            return true;
        } else if (board[2][0] == 'O' && board[2][2] == 'O' && board[2][4] == 'O') {
            System.out.println(won);
            return true;
        } else if (board[4][0] == 'O' && board[4][2] == 'O' && board[4][4] == 'O') {
            System.out.println(won);
            return true;
        } else if (board[0][0] == 'O' && board[2][2] == 'O' && board[4][4] == 'O') {
            System.out.println(won);
            return true;
        } else if (board[0][4] == 'O' && board[2][2] == 'O' && board[4][0] == 'O') {
            System.out.println(won);
            return true;
        } else if (board[0][0] == 'O' && board[2][0] == 'O' && board[4][0] == 'O') {
            System.out.println(won);
            return true;
        } else if (board[0][2] == 'O' && board[2][2] == 'O' && board[4][2] == 'O') {
            System.out.println(won);
            return true;
        } else if (board[0][4] == 'O' && board[2][4] == 'O' && board[4][4] == 'O') {
            System.out.println(won);
            return true;
        }
        return false;
    }
}
