package xohzzwn6kcj9.leetcode;

import java.util.List;

public class S234 {
    public boolean isPalindrome(ListNode head) {
        ListNode reversed = null;

        for (ListNode cur = head; cur != null; cur = cur.next) {
            ListNode before = new ListNode(cur.val);
            before.next = reversed;
            reversed = before;
        }

        ListNode cur = head;
        ListNode rev = reversed;
        while (cur != null && rev != null) {
            if (cur.val != rev.val) {
                return false;
            }

            cur = cur.next;
            rev = rev.next;
        }

        return true;
    }
}

