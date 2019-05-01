package xohzzwn6kcj9.leetcode;

public class S45 {

    private static final int UNREACHABLE = Integer.MAX_VALUE;

    public int jump(int[] nums) {
        int[] numOfPathsFrom = new int[nums.length];
        numOfPathsFrom[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                numOfPathsFrom[i] = UNREACHABLE;
            } else {
                int minNumOfPaths = UNREACHABLE;
                for (int jump = 1; jump <= nums[i]; jump++) {
                    int next = i + jump;
                    if (next < nums.length && numOfPathsFrom[next] < minNumOfPaths) {
                        minNumOfPaths = numOfPathsFrom[next];
                    }
                }
                if(minNumOfPaths < UNREACHABLE){
                    numOfPathsFrom[i] = minNumOfPaths + 1;
                } else {
                    numOfPathsFrom[i] = UNREACHABLE;
                }
            }
        }
        return numOfPathsFrom[0];
    }
}
