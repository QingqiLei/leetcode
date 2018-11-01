package linkedlist.easy;

import linkedlist.easy.ListNode;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (fast != null) {
            slow = slow.next;
        }
        ListNode newHead = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = newHead;
            newHead = slow;
            slow = next;
        }

        while (head != null && newHead != null) {
            if (head.val != newHead.val)
                return false;
            head = head.next;
            newHead = newHead.next;
        }

        return true;

    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode next = head.next;
        ListNode newHead = reverseList(next);
        next.next = head;
        head.next = null;
        return newHead;
    }

}
