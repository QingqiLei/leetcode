package stack.monotone;

import linkedlist.easy.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElementII503 {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for(; head != null; list.add(head.val), head= head.next);
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            if(!stack.isEmpty() &&list.get(stack.peek()) < list.get(i)){
                res[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }
        return res;
    }
}
