package xohzzwn6kcj9.leetcode;

import com.google.common.collect.Lists;

import javax.annotation.concurrent.Immutable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Immutable
public class S15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return Collections.emptyList();
        }
        qsort(nums, 0, nums.length - 1);

        final List<List<Integer>> answer = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int leftValue = nums[left];
                int rightValue = nums[right];
                int sum = nums[i] + leftValue + rightValue;
                if (sum == 0) {
                    answer.add(Arrays.asList(nums[i], leftValue, rightValue));
                    while (left < right && nums[left] == leftValue) left++;
                    while (right > left && nums[right] == rightValue) right--;
                } else if(sum > 0){
                    while (right > left && nums[right] == rightValue) right--;
                } else { // sum < 0
                    while (left < right && nums[left] == leftValue) left++;
                }
            }
        }
        return answer;
    }


    private void qsort(int[] nums, int from, int to) {
        if (from >= to) {
            return;
        }
        int pivot = nums[(from + to) / 2];
        int i = from;
        int j = to;
        while (i <= j) {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        qsort(nums, from, j);
        qsort(nums, i, to);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
