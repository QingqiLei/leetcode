package linkedlist.easy;

public class DesignLinkedList707 {

    int length;
    Node head;

    private class Node {
        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
        }
    }

    public DesignLinkedList707() {
        length = 0;
        head = null;
    }

    public int get(int index) {
        if (index < 0 || index >= length)
            return -1;

        int counter = 0;
        Node curr = head;
        while (counter != index) {
            counter++;
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) { //********
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        length++;


    }

    public void addAtTail(int val) {
        if (length == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);

        Node node = head;
        while (node.next != null) {

            node = node.next;
        }

        node.next = newNode;
        newNode.next=null;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length) {
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        int counter = 0;
        if (index == this.length){
            addAtTail(val);
            return;

        }

        if (index == 0) {
            addAtHead(val);
            return;
        }
        while (counter != index - 1) {
            counter++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length)
            return;
        Node curr = head;
        if (index == 0) {
            head = curr.next;
            length--;
            return;

        }
        Node current = head;
        Node pre = null;
        int counter = 0;
        while (counter != index) {
            pre = current;
            current = current.next;
            counter++;
        }
        pre.next = current.next;
        length--;

    }

    public static void main(String[] args){
        DesignLinkedList707 list = new DesignLinkedList707();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1,2);
        System.out.println(list.get(1));
        list.deleteAtIndex(1);
        System.out.println(list.get(1));

    }
}
