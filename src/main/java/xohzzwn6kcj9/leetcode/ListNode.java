package xohzzwn6kcj9.leetcode;

import com.google.common.base.Strings;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode parse(String s) {
        if (Strings.isNullOrEmpty(s)) {
            return null;
        } else {
            return TestUtils.stringToListNode("[" + s.replace("->", ",") + "]");
        }
    }

    @Override
    public String toString() {
        ListNode cur = this;
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.val);

        while (cur.next != null) {
            sb.append(", ").append(cur.next.val);
            cur = cur.next;
        }

        return sb.append("]").toString();
    }
}
