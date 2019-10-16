package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianfromDataStream295 {
    /** initialize your data structure here. */
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder()), right = new PriorityQueue<>();

    public FindMedianfromDataStream295() {

    }

    public void addNum(int num) {
        left.add(num);
        right.add(left.poll());
        if(right.size() > left.size()) left.add(right.poll());
    }

    public double findMedian() {
        if(left.size() == right.size()) return ((double)left.peek() + (double)(right.peek()))/2;
        else return (double)left.peek();
    }
}
