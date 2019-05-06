package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("87. Scramble String")
class S87Test {

    private S87 subject;

    @BeforeEach
    void setUp() {
        subject = new S87();
    }

    @Test
    void example1() {
        assertThat(subject.isScramble("great", "rgeat")).isTrue();
    }

    @Test
    void example1_1() {
        assertThat(subject.isScramble("great", "rgtae")).isTrue();
    }

    @Test
    void example2() {
        assertThat(subject.isScramble("abcde", "great")).isFalse();
    }

    @Test
    void empty() {
        assertThat(subject.isScramble("", "")).isTrue();
    }

    @Test
    void singleCharacter() {
        assertThat(subject.isScramble("a", "a")).isTrue();
    }

    @Test
    void twoCharacter() {
        assertThat(subject.isScramble("ab", "ba")).isTrue();
    }

    @Test
    void wrongAnswer1() {
        assertThat(subject.isScramble("abb", "bab")).isTrue();
    }

    @Test
    void wrongAnswer2() {
        assertThat(subject.isScramble("abc", "bac")).isTrue();
    }

    @Test
    void wrongAnswer3() {
        assertThat(subject.isScramble("abcde", "caebd")).isFalse();
    }

    @Test
    void eat_eat() {
        assertThat(subject.isScramble("eat", "eat")).isTrue();
    }

    @Test
    void eat_eta() {
        assertThat(subject.isScramble("eat", "eta")).isTrue();
    }

    @Test
    void eat_ate() {
        assertThat(subject.isScramble("eat", "ate")).isTrue();
    }

    @Test
    void eat_tae() {
        assertThat(subject.isScramble("eat", "tae")).isTrue();
    }

    @Test
    void timeLimitExceeded1() {
        assertThat(subject.isScramble("abcdefghijklmn", "efghijklmncadb")).isFalse();
    }
}