package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("7. Reverse Integer")
class S7Test {

    private S7 subject;

    @BeforeEach
    void setUp() {
        subject = new S7();
    }

    @Test
    void example1() {
        assertThat(subject.reverse(123)).isEqualTo(321);
    }

    @Test
    void example2() {
        assertThat(subject.reverse(-123)).isEqualTo(-321);
    }

    @Test
    void example3() {
        assertThat(subject.reverse(120)).isEqualTo(21);
    }

    @Test
    void overflow() {
        assertThat(subject.reverse(Integer.MAX_VALUE)).isEqualTo(0);
        assertThat(subject.reverse(Integer.MIN_VALUE)).isEqualTo(0);
    }
}