package linkedlist.easy;

public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            pre = curr;
            curr = curr.next;
            while(curr != null && curr.val == pre.val)
                curr = curr.next;
            pre.next = curr;
        }
        return head;
    }

    }
