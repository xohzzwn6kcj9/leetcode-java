package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("16. 3Sum Closest")
class S16Test {

    private S16 subject;

    @BeforeEach
    void setUp() {
        subject = new S16();
    }

    @Test
    void example1() {
        final int[] givenArray = TestUtils.stringToIntegerArray("[-1, 2, 1, -4]");
        final int target = 1;

        assertThat(subject.threeSumClosest(givenArray, target)).isEqualTo(2);
    }

    @Test
    void wrongAnswer1() {
        final int[] givenArray = TestUtils.stringToIntegerArray("[1,2,5,10,11]");
        final int target = 12;

        assertThat(subject.threeSumClosest(givenArray, target)).isEqualTo(13);
    }
}