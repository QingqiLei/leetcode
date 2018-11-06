package stack.easy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * deque queue:  the first is the rightest, the end is the leftest,
 */
public class NumberofRecentCalls933 {
    Deque<Integer> deque;
    public NumberofRecentCalls933(){
        deque = new LinkedList<>();

    }

    public int ping(int t){
        while(!deque.isEmpty() && t - deque.getFirst() >3000) deque.removeFirst();
        deque.add(t);
        return deque.size();
    }
}
