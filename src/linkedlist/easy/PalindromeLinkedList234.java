package linkedlist.easy;

import linkedlist.easy.ListNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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

        /*
        1 -> 2(newHead)   3(slow) -> 4 ->5 -> null
        1 <- 2(newHead)   3(slow) -> 4(next) -> 5 -> null
        1 <- 2(newHead) <-  3(slow)  4(next) -> 5 -> null
        1 <- 2  <- 3(newHead,slow)  4(next) -> 5 -> null
        1 <- 2  <- 3(newHead)  4(slow) -> 5 -> null

         */

        while (slow != null) {           // rotate
            ListNode next = slow.next;
            slow.next = newHead;
            newHead = slow;
            slow = next;
        }

        while (head != null && newHead != null) {
            if (head.val != newHead.val)  // return false if they are not same
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

    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.offer(1);
        stack.offer(2);

        System.out.println(Arrays.toString(stack.toArray()));

//        stack.forEach(s-> System.out.print(s + " "));


    }

}
