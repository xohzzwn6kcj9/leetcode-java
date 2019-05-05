package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("54. Spiral Matrix")
class S54Test {
    private S54 subject;

    @BeforeEach
    void setUp() {
        subject = new S54();
    }

    @Test
    void example1() {
        final int[][] matrix = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };

        final List<Integer> result = subject.spiralOrder(matrix);

        assertThat(result).hasSameElementsAs(Arrays.asList(
                1, 2, 3, 6, 9, 8, 7, 4, 5, 6
        ));
    }

    @Test
    void example2() {
        final int[][] matrix = new int[][]{
                new int[]{1, 2, 3, 4},
                new int[]{5, 6, 7, 8},
                new int[]{9, 10, 11, 12},
                new int[]{13, 14, 15, 16}
        };

        final List<Integer> result = subject.spiralOrder(matrix);

        assertThat(result).hasSameElementsAs(Arrays.asList(
                1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10
        ));
    }
}