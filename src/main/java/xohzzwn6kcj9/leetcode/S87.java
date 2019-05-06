package xohzzwn6kcj9.leetcode;

import java.util.HashMap;
import java.util.Map;

public class S87 {
    private final Map<String, Boolean> cache = new HashMap<>();

    // TODO: To be improved
    public boolean isScramble(String s1, String s2) {
        if (cache.containsKey(s1 + "^|^" + s2)) {
            return cache.get(s1 + "^|^" + s2);
        }

        System.out.println(s1 + " vs " + s2);
        if (s1.equals(s2)) {
            cache.put(s1 + "^|^" + s2, true);
            return true;
        }

        int n = s1.length();
        for (int partition = 1; partition < n; partition++) {
            final String s1First = s1.substring(0, partition);
            final String s2First = s2.substring(0, partition);

            final String s1Second = s1.substring(partition);
            final String s2Second = s2.substring(partition);

            final String s2First2 = s2.substring(0, n - partition);
            final String s2Second2 = s2.substring(n - partition);

            if (s2.equals(s1Second + s1First) || s1.equals(s2Second + s2First)) {
                cache.put(s1 + "^|^" + s2, true);
                return true;
            } else if (isScramble(s1First, s2First) && isScramble(s1Second, s2Second)) {
                cache.put(s1 + "^|^" + s2, true);
                return true;
            } else if (isScramble(s1First, s2Second2) && isScramble(s1Second, s2First2)) {
                cache.put(s1 + "^|^" + s2, true);
                return true;
            }
        }
        cache.put(s1 + "^|^" + s2, false);
        return false;
    }

}
