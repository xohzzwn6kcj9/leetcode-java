package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("52. N-Queens II")
class S52NQueen2Test {

    private S52NQueen2 subject;

    @BeforeEach
    void setUp() {
        subject = new S52NQueen2();
    }

    @Test
    void example1() {
        assertThat(subject.totalNQueens(4)).isEqualTo(2);
    }

    @Test
    void example2() {
        assertThat(subject.totalNQueens(5)).isEqualTo(10);
    }

    @Test
    void example3() {
        assertThat(subject.totalNQueens(6)).isEqualTo(4);
    }

    @Test
    void name() {
        for (int i = 4; i < 15; i++) {
            int answer = new S52NQueen2().totalNQueens(i);
            System.out.println(i + "\t: " + answer);
        }
    }
    
}