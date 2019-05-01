package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("45. Jump Game II")
class S45Test {
    private S45 subject;

    @BeforeEach
    void setUp() {
        subject = new S45();
    }

    @Test
    void example1() {
        final int[] nums = TestUtils.stringToIntegerArray("[2,3,1,1,4]");
        assertThat(subject.jump(nums)).isEqualTo(2);
    }

    @Test
    void timeLimitExceeded1() {
        final int[] nums = TestUtils.stringToIntegerArray("[8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5]");
        assertThat(subject.jump(nums)).isEqualTo(13);
    }

    @Test
    void trivialAnswer() {
        final int[] nums = TestUtils.stringToIntegerArray("[0]");
        assertThat(subject.jump(nums)).isEqualTo(0);
    }

    @Test
    void discussion1() {
        final int[] nums = TestUtils.stringToIntegerArray("[5,1,1,5,1,1,1,1,1]");
        assertThat(subject.jump(nums)).isEqualTo(2);
    }

    @Test
    void increasing1() {
        final int[] nums = TestUtils.stringToIntegerArray("[1,2,3,4,5,6,7,8,9,10,11,12]");
        assertThat(subject.jump(nums)).isEqualTo(4);
    }

    @Test
    void increasing2() {
        final int[] nums = TestUtils.stringToIntegerArray("[1,2,3,4,5]");
        assertThat(subject.jump(nums)).isEqualTo(3);
    }
}