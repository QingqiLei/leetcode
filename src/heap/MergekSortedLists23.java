package heap;

import linkedlist.easy.ListNode;

import java.util.PriorityQueue;

public class MergekSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((l1, l2)->(l1.val - l2.val));
        ListNode head = new ListNode(0),tail = head;
        for(ListNode node : lists) if(node != null) heap.offer(node);
        while(!heap.isEmpty()){
            tail.next = heap.poll();
            tail = tail.next;
            if(tail.next != null) heap.add(tail.next);
        }
        return head.next;
    }
}
