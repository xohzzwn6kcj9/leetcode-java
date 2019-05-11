package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("51. N-Queens")
class S51NQueenTest {
    private S51NQueen subject;

    @BeforeEach
    void setUp() {
        subject = new S51NQueen();
    }

    @Test
    void example1() {
        int n = 4;
        final List<List<String>> answer = subject.solveNQueens(n);
        assertThat(answer).containsExactly(
                Arrays.asList(
                        ".Q..",
                        "...Q",
                        "Q...",
                        "..Q."
                ),
                Arrays.asList(
                        "..Q.",
                        "Q...",
                        "...Q",
                        ".Q.."
                )
        );
    }
}