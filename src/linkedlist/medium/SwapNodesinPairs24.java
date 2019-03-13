package linkedlist.medium;

import linkedlist.easy.ListNode;

public class SwapNodesinPairs24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newhead = head.next;
        head.next = swapPairs(head.next.next);
        newhead.next = head;
        return newhead;
    }
}
