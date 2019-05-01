package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("15. 3Sum")
class S15Test {

    private S15 subject;

    @BeforeEach
    void setUp() {
        subject = new S15();
    }

    @Test
    void example1() {
        final int[] givenArray = TestUtils.stringToIntegerArray("[-1, 0, 1, 2, -1, -4]");

        final List<List<Integer>> result = subject.threeSum(givenArray);

        assertThat(result).containsAll(
                Arrays.asList(
                        Arrays.asList(-1, 0, 1),
                        Arrays.asList(-1, -1, 2)
                )
        );
    }

    @Test
    void wrongAnswer1() {
        final int[] givenArray = TestUtils.stringToIntegerArray("[1,-1,-1,0]");

        final List<List<Integer>> result = subject.threeSum(givenArray);

        assertThat(result).containsAll(
                Collections.singletonList(
                        Arrays.asList(-1, 0, 1)
                )
        );
    }

    @Test
    void wrongAnswer2() {
        final int[] givenArray = TestUtils.stringToIntegerArray("[3,0,-2,-1,1,2]");

        final List<List<Integer>> result = subject.threeSum(givenArray);

        assertThat(result).containsAll(
                Arrays.asList(
                        Arrays.asList(-2, -1, 3),
                        Arrays.asList(-2, 0, 2),
                        Arrays.asList(-1, 0, 1)
                )
        );
    }
}