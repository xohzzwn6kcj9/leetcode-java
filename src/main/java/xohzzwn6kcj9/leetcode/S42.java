package xohzzwn6kcj9.leetcode;

public class S42 {
    public int trap(int[] height) {
        int area = 0;
        int l = 0;
        int r = l + 1;
        int subArea = 0;
        while (r < height.length) {
            int diff = height[l] - height[r];
            if (diff > 0) {
                subArea += diff;
                r++;
            } else {
                l = r++;
                area += subArea;
                subArea = 0;
            }
        }

        r = height.length - 1;
        l = r - 1;
        subArea = 0;
        while (l >= 0) {
            int diff = height[r] - height[l];
            if (diff > 0) {
                subArea += diff;
                l--;
            } else if (diff < 0) {
                r = l--;
                area += subArea;
                subArea = 0;
            } else {
                r = l--;
            }
        }

        return area;
    }
}
