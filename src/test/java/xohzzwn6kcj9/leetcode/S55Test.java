package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("55. Jump Game")
class S55Test {

    private S55 subject;

    @BeforeEach
    void setUp() {
        subject = new S55();
    }

    @Test
    void example1() {
        final int[] nums = TestUtils.stringToIntegerArray("[2,3,1,1,4]");
        assertThat(subject.canJump(nums)).isTrue();
    }

    @Test
    void example2() {
        final int[] nums = TestUtils.stringToIntegerArray("[3,2,1,0,4]");
        assertThat(subject.canJump(nums)).isFalse();
    }

    @Test
    void wrongAnswer1() {
        final int[] nums = TestUtils.stringToIntegerArray("[0]");
        assertThat(subject.canJump(nums)).isTrue();
    }

    @Test
    void wrongAnswer2() {
        final int[] nums = TestUtils.stringToIntegerArray("[0,2,3]");
        assertThat(subject.canJump(nums)).isFalse();
    }
}