package linkedlist.hard;

import linkedlist.easy.ListNode;

public class ReverseNodesinkGroup25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        int n = k;
        ListNode last = head;
        while (n-- != 1 && last != null) {
            last = last.next;
        }
        if (last == null) return head;

        ListNode newHead = null;
        ListNode tmpHead = head;
        ListNode tmp = reverseKGroup(last.next, k);
        while (newHead != last) {
            ListNode next = tmpHead.next;
            tmpHead.next = newHead;
            newHead = tmpHead;
            tmpHead = next;
        }
        head.next = tmp;
        return newHead;
    }
}
