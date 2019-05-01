package xohzzwn6kcj9.leetcode;

import java.util.Stack;

public class S20 {
    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty() || !matches(stack.pop(), c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean matches(char start, char end) {
        return (start == '(') && end == ')' ||
                (start == '{') && end == '}' ||
                (start == '[') && end == ']';
    }
}
