package xohzzwn6kcj9.leetcode;

public class S10 {
    public boolean isMatch(String s, String p) {
        String pattern = reduce(p);
        if (pattern.isEmpty()) {
            return s.isEmpty();
        }

        if (s.isEmpty()) {
            return startsWithIterativePattern(pattern) && isMatch(s, pattern.substring(2));
        }

        if (startsWithIterativePattern(pattern)) {
            if (isFirstLetterMatch(s, pattern)) {
                // case 1: 첫글자가 매치되는경우
                return isMatch(s.substring(1), pattern) ||
                        isMatch(s.substring(1), pattern.substring(2)) ||
                        isMatch(s, pattern.substring(2));
            } else {
                // case 2: 매치 안되는경우
                return isMatch(s, pattern.substring(2));
            }
        } else {
            return isFirstLetterMatch(s, pattern) && isMatch(s.substring(1), pattern.substring(1));
        }
    }

    private boolean startsWithIterativePattern(String p) {
        return p.length() > 1 && p.charAt(1) == '*';
    }

    private boolean isFirstLetterMatch(String s, String p) {
        return (s.isEmpty() && p.isEmpty()) || s.charAt(0) == p.charAt(0) || p.charAt(0) == '.';
    }

    private String reduce(String p) {
        String reduced = p;
        for (char c = 'a'; c <= 'z'; c++) {
            reduced = reduce(reduced, c);
        }
        return reduced;
    }

    private String reduce(String p, char c) {
        String dual = c + "*";
        String reduced = p;
        while (reduced.contains(dual + dual)) {
            reduced = reduced.replace(dual + dual, dual);
        }
        while (reduced.contains(dual + ".*")) {
            reduced = reduced.replace(dual + ".*", ".*");
        }

        while (reduced.contains(".*" + dual)) {
            reduced = reduced.replace(".*" + dual, ".*");
        }
        return reduced;
    }

}
