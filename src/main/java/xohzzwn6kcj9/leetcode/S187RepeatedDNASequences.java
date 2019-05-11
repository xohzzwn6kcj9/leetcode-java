package xohzzwn6kcj9.leetcode;

import java.util.*;

public class S187RepeatedDNASequences {
    private static final int SIZE = 10;
    private static final int[] toInt = new int['T' + 1];

    static {
        toInt['A'] = 0;
        toInt['C'] = 1;
        toInt['G'] = 2;
        toInt['T'] = 3;
    }

    public List<String> findRepeatedDnaSequences(String s) {
        final int n = s.length();
        if (n < 10) {
            return Collections.emptyList();
        }

        final Set<Integer> existing = new HashSet<>();
        final Set<Integer> added = new HashSet<>();
        final List<String> answer = new ArrayList<>();

        int hash = toInt[s.charAt(0)];
        for (int i = 1; i < SIZE; i++) {
            hash = (hash << 2) + toInt[s.charAt(i)];
        }
        existing.add(hash);

        for (int i = SIZE; i < n; i++) {
            hash = (hash << 2) - (toInt[s.charAt(i - 10)] << 20) + toInt[s.charAt(i)];
            if(!existing.contains(hash)){
                existing.add(hash);
            } else if(!added.contains(hash)){
                added.add(hash);
                answer.add(s.substring(i - 9, i + 1));
            }
        }
        return answer;
    }
}
