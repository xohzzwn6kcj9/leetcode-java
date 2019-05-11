package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {
    private QuickSort subject;
    private SecureRandom random = new SecureRandom();

    @BeforeEach
    void setUp() {
        subject = new QuickSort();
    }

    @Test
    void random() {
        int size = random.nextInt(100);
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = random.nextInt();
        }
        subject.qsort(nums);
        assertThat(nums).isSorted();
    }

    @Test
    void name() {
        int[] nums = TestUtils.stringToIntegerArray("[0, 0, 1, 0, 1, 0, 1, 2, 2]");
        subject.qsort(nums);
        assertThat(nums).isSorted();
    }
}