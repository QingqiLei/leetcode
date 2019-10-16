package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMedian480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> left = new PriorityQueue<Integer>(Collections.reverseOrder()); //从大到小
        PriorityQueue<Integer> right = new PriorityQueue<Integer>(); // 从小到大， 默认
        double[] res = new double[nums.length -k +1];
        for(int i  = 0; i < nums.length; i++){
            left.add(nums[i]);
            right.add(left.poll());
            // make sure that 左边的不比右边的少
            if(right.size() > left.size()) left.add(right.poll());
            // 前面 k -1个元素，不找中间值， 到第k个元素时，执行下面if语句
            if(i >= k-1){
                // 先找中间值
                if(k % 2 == 1) res[i-k+1] = (double)left.peek();
                else res[i-k+1] = ((double)left.peek() + (double)right.peek())/2.0;
                // 再把窗口最左边的元素删除掉
                if(!left.remove(nums[i-k+1])) right.remove(nums[i-k+1]);
            }
        }
        return res;

    }
}
