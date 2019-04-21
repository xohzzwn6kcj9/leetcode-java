package xohzzwn6kcj9.leetcode;

public class S7 {
    public int reverse(int x) {
        long n = Math.abs((long) x);
        long q = n / 10;
        long r = n % 10;

        long[] digits = new long[10];
        int i = 0;
        while (n > 0) {
            digits[i++] = r;

            n = q;
            q = n / 10;
            r = n % 10;
        }

        long answer = 0;
        long power = 1;
        for (int j = i - 1; j >= 0; j--) {
            answer += digits[j] * power;
            power *= 10;
        }

        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
            return 0;
        } else if (x < 0) {
            return (int) (answer * -1);
        } else {
            return (int) answer;
        }
    }
}
