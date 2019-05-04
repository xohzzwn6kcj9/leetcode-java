package xohzzwn6kcj9.leetcode;

import java.util.ArrayList;
import java.util.List;

public class S46 {
    public List<List<Integer>> permute(int[] nums) {
        final List<List<Integer>> answer = new ArrayList<>();
        backTrack(answer, new ArrayList<>(), nums, 0);
        return answer;
    }

    private void backTrack(
            List<List<Integer>> answer,
            List<Integer> path,
            int[] nums,
            int depth) {
        if (nums.length == depth) {
            answer.add(new ArrayList<>(path));
        } else {
            for (int num : nums) {
                if (!path.contains(num)) {
                    final List<Integer> p = new ArrayList<>(path);
                    p.add(num);
                    backTrack(answer, p, nums, depth + 1);
                }
            }
        }
    }
}
