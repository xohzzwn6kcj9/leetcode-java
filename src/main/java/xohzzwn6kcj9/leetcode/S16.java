package xohzzwn6kcj9.leetcode;

public class S16 {
    public int threeSumClosest(int[] nums, int target) {
        java.util.Arrays.sort(nums);

        int answer = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(target - answer);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int leftValue = nums[left];
                int rightValue = nums[right];
                int sum = nums[i] + leftValue + rightValue;
                int diff = Math.abs(target - sum);
                if (target == sum) {
                    return sum;
                } else if (diff < minDiff) {
                    answer = sum;
                    minDiff = diff;
                }

                if (sum < target) {
                    while (left < right && nums[left] == leftValue) left++;
                } else { // sum > target
                    while (left < right && nums[right] == rightValue) right--;
                }
            }

        }
        return answer;
    }

}
