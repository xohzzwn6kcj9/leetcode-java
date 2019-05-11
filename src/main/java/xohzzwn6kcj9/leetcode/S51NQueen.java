package xohzzwn6kcj9.leetcode;

import java.util.ArrayList;
import java.util.List;

public class S51NQueen {
    private final List<List<String>> answer = new ArrayList<>();
    private boolean[] visitCol;

    public List<List<String>> solveNQueens(int n) {
        final char[][] board = new char[n][n];
        visitCol = new boolean[n];
        for (int i = 0; i < n; i++) {
            visitCol[i] = false;
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = 'X';
            }
        }

        go(board, 0, n);
        return answer;
    }

    private void go(char[][] board, int currentRow, int queensLeft) {
        if (currentRow == board.length) {
            if (queensLeft == 0) {
                answer.add(copyToAnswer(board));
            }
            return;
        }

        for (int col = 0; col < board.length; col++) {
            board[currentRow][col] = '.';
        }

        for (int col = 0; col < board.length; col++) {
            if (canPut(board, currentRow, col)) {
                board[currentRow][col] = 'Q';
                boolean tmp = visitCol[col];
                visitCol[col] = true;

                go(board, currentRow + 1, queensLeft - 1);

                board[currentRow][col] = '.';
                visitCol[col] = tmp;
            }
        }
    }

    private List<String> copyToAnswer(char[][] board) {
        final List<String> answer = new ArrayList<>();
        for (char[] chars : board) {
            answer.add(new String(chars));
        }
        return answer;
    }

    // O(4n)
    private boolean canPut(char[][] board, int row, int col) {
        if (visitCol[col]) {
            return false;
        }
        for (int r = 0; r < row; r++) {
            if (board[r][col] == 'Q') return false;
        }
        for (int i = 0; row - i >= 0; i++) {
            if (col + i < board.length && board[row - i][col + i] == 'Q') return false;
        }
        for (int i = 0; row - i >= 0 && col - i >= 0; i++) {
            if (col - i >= 0 && board[row - i][col - i] == 'Q') return false;
        }
        return true;
    }
}
