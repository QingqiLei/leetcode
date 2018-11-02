package linkedlist.easy;




public class ReverseLinkedList206 {
    //    <-  newHead;   head -> next; we let them move right
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = next;
            head = next;
        }
        return newHead;
    }
    public ListNode reverseList2(ListNode head) {
        // head->nextNode ->-> newHead,: nextNode->head, head->null
        if(head == null || head.next == null)
            return head;
        ListNode nextNode = head.next;
        ListNode newHead = reverseList2(nextNode);
        nextNode.next = head;
        head.next = null;
        return newHead;
    }
    }
