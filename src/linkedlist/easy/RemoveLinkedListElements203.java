package linkedlist.easy;

public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null ) return null;
        head.next = removeElements(head.next,val);
        return head.val == val? head.next:head;
    }

    public ListNode removeElements1(ListNode head, int val){
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        while(pre.next != null){
            if(pre.next.val == val) pre.next = pre.next.next;
            else pre = pre.next;
        }
        return fakeHead.next;
    }

    }
