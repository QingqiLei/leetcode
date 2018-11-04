package linkedlist.easy;

public class DeleteNodeinaLinkedList237 {
    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
