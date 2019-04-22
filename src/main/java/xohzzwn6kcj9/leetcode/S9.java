package xohzzwn6kcj9.leetcode;

public class S9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = x;
        int q = n / 10;
        int r = n % 10;
        int[] digits = new int[11];
        int i = 0;
        while (n > 0) {
            digits[i++] = r;
            n = q;
            q = n / 10;
            r = n % 10;
        }
        i--;

        int j = 0;

        while (j < i) {
            if (digits[j++] != digits[i--]) {
                return false;
            }
        }

        return true;
    }
}
