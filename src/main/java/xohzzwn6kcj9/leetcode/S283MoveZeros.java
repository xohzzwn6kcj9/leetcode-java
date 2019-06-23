package xohzzwn6kcj9.leetcode;

public class S283MoveZeros {
    public void moveZeroes(int[] nums) {
        int afterMoved = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != afterMoved) {
                    nums[afterMoved] = nums[i];
                    nums[i] = 0;
                }
                afterMoved++;
            }
        }
    }
}
