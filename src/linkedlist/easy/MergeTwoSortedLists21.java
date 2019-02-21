package linkedlist.easy;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode current;
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        if (l1.val > l2.val) {
            head = new ListNode(l2.val);
            l2 = l2.next;
        } else if (l1.val < l2.val) {
            head = new ListNode(l1.val);
            l1 = l1.next;

        } else {
            head = new ListNode(l1.val);
            l1 = l1.next;
        }

        current = head;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                current.next = l2;
                break;
            }
            if (l2 == null) {
                current.next = l1;
                break;
            }

            if (l1.val > l2.val) {
                current.next = l2;
                l2 = l2.next;
            } else if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l1;
                l1 = l1.next;
            }

            current = current.next;
        }
        return head;
    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null)return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}


