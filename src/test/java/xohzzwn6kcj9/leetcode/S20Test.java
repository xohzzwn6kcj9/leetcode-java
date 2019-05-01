package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("20. Valid Parentheses")
class S20Test {

    private S20 subject;

    @BeforeEach
    void setUp() {
        subject = new S20();
    }

    @Test
    void example1() {
        assertThat(subject.isValid("()")).isTrue();
    }

    @Test
    void example2() {
        assertThat(subject.isValid("()[]{}")).isTrue();
    }

    @Test
    void example3() {
        assertThat(subject.isValid("(]")).isFalse();
    }

    @Test
    void someComplexExample1() {
        assertThat(subject.isValid("((){[{()()()}[]]()})")).isTrue();
    }
}