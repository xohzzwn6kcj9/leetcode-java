package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("46. Permutations")
class S46Test {

    private S46 subject;

    @BeforeEach
    void setUp() {
        subject = new S46();
    }

    @Test
    void example1() {
        List<List<Integer>> result = subject.permute(TestUtils.stringToIntegerArray("[1,2,3]"));

        assertThat(result).containsAll(
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(2, 1, 3),
                        Arrays.asList(2, 3, 1),
                        Arrays.asList(3, 1, 2),
                        Arrays.asList(3, 2, 1)
                )
        );

    }
}