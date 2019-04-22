package xohzzwn6kcj9.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("234. Palindrome Linked List")
class S234Test {

    private S234 subject;

    @BeforeEach
    void setUp() {
        subject = new S234();
    }

    @Test
    void example1() {
        ListNode input = ListNode.parse("1->2");
        assertThat(subject.isPalindrome(input)).isFalse();
    }

    @Test
    void example2() {
        ListNode input = ListNode.parse("1->2->2->1");
        assertThat(subject.isPalindrome(input)).isTrue();
    }
}