package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("42. Trapping Rain Water")
class S42Test {

    private S42 subject;

    @BeforeEach
    void setUp() {
        subject = new S42();
    }

    @Test
    void increasing() {
        int[] input = TestUtils.stringToIntegerArray("[0,1,2,3,4,5,6,7,8,9,10]");
        assertThat(subject.trap(input)).isEqualTo(0);
    }

    @Test
    void decreasing() {
        int[] input = TestUtils.stringToIntegerArray("[10,9,8,7,6,5,4,3,2,1,0]");
        assertThat(subject.trap(input)).isEqualTo(0);
    }

    @Test
    void name() {
        int[] input = TestUtils.stringToIntegerArray("[2,0,2]");
        assertThat(subject.trap(input)).isEqualTo(2);
    }

    @Test
    void name2() {
        int[] input = TestUtils.stringToIntegerArray("[2,0,2,0,2]");
        assertThat(subject.trap(input)).isEqualTo(4);
    }

    @Test
    void example() {
        int[] input = TestUtils.stringToIntegerArray("[0,1,0,2,1,0,1,3,2,1,2,1]");
        assertThat(subject.trap(input)).isEqualTo(6);
    }
}