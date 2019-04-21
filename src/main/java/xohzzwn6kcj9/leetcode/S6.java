package xohzzwn6kcj9.leetcode;

public class S6 {
    public String convert(String s, int numRows) {
        if (s.length() < 2 || numRows < 2) {
            return s;
        }
        int n = s.length();
        @SuppressWarnings("UnnecessaryLocalVariable") int numCols = n;

        System.out.println("s.length()=" + s.length() + ", numRows=" + numRows + ", numCols=" + numCols);

        char[][] pane = new char[numRows][numCols];

        int row = 0;
        int col = 0;
        boolean rowIncreasing = true;
        for (int i = 0; i < n; i++) {
            System.out.println("i=" + i +", row=" + row + ", col=" + col);
            pane[row][col] = s.charAt(i);
            if (rowIncreasing) {
                if (row == numRows - 1) {
                    row--;
                    col++;
                    rowIncreasing = false;
                } else {
                    row++;
                }
            } else { // row is Decreasing
                if (row == 0) {
                    row++;
                    rowIncreasing = true;
                } else {
                    row--;
                    col++;
                }
            }
        }
        StringBuilder answer = new StringBuilder();

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (pane[r][c] > 0) {
                    answer.append(pane[r][c]);
                }
            }
        }

        return answer.toString();
    }
}
