package xohzzwn6kcj9.leetcode;

public class S52NQueen2 {

    private boolean[] colVisited;
    private int answer;

    public int totalNQueens(int n) {
        answer = 0;
        char[][] board = new char[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                board[r][c] = '.';
            }
        }

        colVisited = new boolean[n];
        for (int c = 0; c < n; c++) {
            colVisited[c] = false;
        }
        go(board, 0, n);

        return answer;
    }

    private void go(char[][] board, int row, int queensLeft) {
        if (row == board.length) {
            if (queensLeft == 0) {
                answer++;
            }
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (canPut(board, row, col)) {
                board[row][col] = 'Q';
                boolean tmp = colVisited[col];
                colVisited[col] = true;

                go(board, row + 1, queensLeft - 1);

                board[row][col] = '.';
                colVisited[col] = tmp;
            }
        }

    }

    private boolean canPut(char[][] board, int row, int col) {
        if (colVisited[col]) {
            return false;
        }

        for (int r = 0; r < row; r++) {
            if (board[r][col] == 'Q') return false;
        }
        for (int i = 1; i <= row; i++) {
            if (col - i >= 0 && board[row - i][col - i] == 'Q') return false;
        }
        for (int i = 1; i <= row; i++) {
            if (col + i < board.length && board[row - i][col + i] == 'Q') return false;
        }
        return true;
    }


}
