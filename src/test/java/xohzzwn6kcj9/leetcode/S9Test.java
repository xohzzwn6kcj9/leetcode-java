package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("9. Palindrome Number")
class S9Test {

    private S9 subject;

    @BeforeEach
    void setUp() {
        subject = new S9();
    }

    @Test
    void example1() {
        assertThat(subject.isPalindrome(121)).isTrue();
    }

    @Test
    void example2() {
        assertThat(subject.isPalindrome(-121)).isFalse();
    }

    @Test
    void example3() {
        assertThat(subject.isPalindrome(10)).isFalse();
    }

}