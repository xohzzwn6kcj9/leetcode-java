package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("11. Container With Most Water")
class S11Test {

    private S11 subject;

    @BeforeEach
    void setUp() {
        subject = new S11();
    }

    @Test
    void example() {
        int[] input = TestUtils.stringToIntegerArray("[1,8,6,2,5,4,8,3,7]");

        assertThat(subject.maxArea(input)).isEqualTo(49);
    }

}