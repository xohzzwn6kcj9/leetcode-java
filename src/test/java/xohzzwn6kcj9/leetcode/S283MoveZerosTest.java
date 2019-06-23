package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("283. Move Zeroes")
class S283MoveZerosTest {

    private S283MoveZeros subject;

    @BeforeEach
    void setUp() {
        subject = new S283MoveZeros();
    }

    @Test
    void example1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};

        subject.moveZeroes(nums);

        assertThat(nums).isEqualTo(new int[]{1, 3, 12, 0, 0});
    }

}