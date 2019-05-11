package xohzzwn6kcj9.leetcode;

public class QuickSort {
    public void qsort(int[] nums) {
        qsort(nums, 0, nums.length - 1);
    }

    private void qsort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = nums[(left + right) / 2];
        int l = left;
        int r = right;
        while (l <= r) {
            while (nums[l] < pivot) l++;
            while (nums[r] > pivot) r--;
            if (l <= r) swap(nums, l++, r--);
        }
        qsort(nums, left, r);
        qsort(nums, l, right);
    }

    private void swap(int[] nums, int l, int r) {
        final int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }

}
