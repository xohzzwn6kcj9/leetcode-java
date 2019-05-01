package xohzzwn6kcj9.leetcode;

public class S55 {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (max < i) {
                return false;
            } else {
                max = Math.max(max, i + nums[i]);
            }
        }

        return max >= nums.length - 1;
    }
}
