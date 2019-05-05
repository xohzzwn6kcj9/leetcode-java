package xohzzwn6kcj9.leetcode;

import java.util.ArrayList;
import java.util.List;

public class S54 {

    enum Direction {
        UP, DOWN, LEFT, RIGHT;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        final List<Integer> answer = new ArrayList<>();
        int rowMin = 0;
        int rowMax = matrix.length - 1;
        if (rowMax < 0) {
            return answer;
        }
        int colMin = 0;
        int colMax = matrix[0].length - 1;
        if (colMax < 0) {
            return answer;
        }

        int row = 0;
        int col = 0;
        Direction direction = Direction.RIGHT;
        int answerSize = (rowMax + 1) * (colMax + 1);
        while (answer.size() < answerSize) {
            System.out.println(row + ", " + col + " => " + matrix[row][col]);
            answer.add(matrix[row][col]);
            switch (direction) {
                case RIGHT:
                    if (col < colMax) col++;
                    else {
                        rowMin++;
                        row++;
                        direction = Direction.DOWN;
                    }
                    break;
                case DOWN:
                    if (row < rowMax) row++;
                    else {
                        colMax--;
                        col--;
                        direction = Direction.LEFT;
                    }
                    break;
                case LEFT:
                    if (col > colMin) col--;
                    else {
                        rowMax--;
                        row--;
                        direction = Direction.UP;
                    }
                    break;
                case UP:
                    if (row > rowMin) row--;
                    else {
                        colMin++;
                        col++;
                        direction = Direction.RIGHT;
                    }
                    break;
                default:
            }
        }

        return answer;
    }
}
