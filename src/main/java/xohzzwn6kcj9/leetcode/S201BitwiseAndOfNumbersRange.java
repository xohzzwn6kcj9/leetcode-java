package xohzzwn6kcj9.leetcode;

public class S201BitwiseAndOfNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int a = m;
        int b = n;
        int rightZeroBits = 0;
        while (a != b) {
            rightZeroBits++;
            a >>= 1;
            b >>= 1;
        }
        return a << rightZeroBits;
    }
}
