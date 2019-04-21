package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("6. ZigZag Conversion")
class S6Test {

    private S6 subject;

    @BeforeEach
    void setUp() {
        subject = new S6();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    void emptyString(int row) {
        assertThat(subject.convert("", row)).isEqualTo("");
    }

    @Test
    void forOnlyOneRow() {
        assertThat(subject.convert("PAYPALISHIRING", 1)).isEqualTo("PAYPALISHIRING");
    }

    @Test
    void forTwoRows() {
        assertThat(subject.convert("PAYPALISHIRING", 2)).isEqualTo("PYAIHRNAPLSIIG");
    }

    @Test
    void example1() {
        assertThat(subject.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void example2() {
        assertThat(subject.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
    }

}