package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("27. Remove Element")
class S27TestRemoveElement {

    private S27RemoveElement subject;

    @BeforeEach
    void setUp() {
        subject = new S27RemoveElement();
    }

    @Test
    void example1() {
        final int[] nums = new int[]{3, 2, 2, 3};
        final int val = 3;

        assertThat(subject.removeElement(nums, val)).isEqualTo(2);
    }

    @Test
    void example2() {
        final int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        final int val = 2;

        assertThat(subject.removeElement(nums, val)).isEqualTo(5);
    }
}