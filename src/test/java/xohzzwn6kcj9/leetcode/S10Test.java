package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("10. Regular Expression Matching")
class S10Test {

    private S10 subject;

    @BeforeEach
    void setUp() {
        subject = new S10();
    }

    @Test
    void example1() {
        final String s = "aa";
        final String p = "a";

        assertThat(subject.isMatch(s, p)).isFalse();
    }

    @Test
    void example2() {
        final String s = "aa";
        final String p = "a*";

        assertThat(subject.isMatch(s, p)).isTrue();
    }

    @Test
    void example3() {
        final String s = "ab";
        final String p = ".*";

        assertThat(subject.isMatch(s, p)).isTrue();
    }

    @Test
    void example4() {
        final String s = "aab";
        final String p = "c*a*b";

        assertThat(subject.isMatch(s, p)).isTrue();
    }

    @Test
    void example5() {
        final String s = "mississippi";
        final String p = "mis*is*p*.";

        assertThat(subject.isMatch(s, p)).isFalse();
    }

    @Test
    void name() {
        final String s = "a";
        final String p = "ab*";

        assertThat(subject.isMatch(s, p)).isTrue();
    }

    @Test
    void emptyString_matches() {
        final String s = "";
        final String p = "x*";
        assertThat(subject.isMatch(s, p)).isTrue();
    }

    @Test
    void longPattern() {
        final String s = "aaaaaaaaaaaaab";
        final String p = "a*a*a*a*a*a*a*a*a*a*c";
        assertThat(subject.isMatch(s, p)).isFalse();
    }
}