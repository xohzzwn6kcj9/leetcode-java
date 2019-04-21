package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("8. String to Integer (atoi)")
class S8Test {
    private S8 subject;

    @BeforeEach
    void setUp() {
        subject = new S8();
    }

    @Test
    void emptyString() {
        assertThat(subject.myAtoi("")).isEqualTo(0);
    }

    @Test
    void zero() {
        assertThat(subject.myAtoi("0")).isEqualTo(0);
    }

    @Test
    void example1() {
        assertThat(subject.myAtoi("42")).isEqualTo(42);
    }

    @Test
    void example2() {
        assertThat(subject.myAtoi("     -42")).isEqualTo(-42);
    }

    @Test
    void example3() {
        assertThat(subject.myAtoi("4193 with words")).isEqualTo(4193);
    }

    @Test
    void example4() {
        assertThat(subject.myAtoi("words and 987")).isEqualTo(0);
    }

    @Test
    void example5() {
        assertThat(subject.myAtoi("-91283472332")).isEqualTo(Integer.MIN_VALUE);
    }

    @Test
    void positiveOverflow() {
        String overflowed = Long.toString(((long) Integer.MAX_VALUE) + 1L);
        assertThat(subject.myAtoi(overflowed)).isEqualTo(Integer.MAX_VALUE);
    }

}