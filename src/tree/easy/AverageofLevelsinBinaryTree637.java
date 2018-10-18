package tree.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root){
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> list = new LinkedList<>();
        list.offer(root);
        while(! list.isEmpty()){
            int n  = list.size();
            double sum = 0;
            for(int i = 0; i < n; i ++){
                if(list.peek().left != null) list.offer(list.peek().left);
                if(list.peek().right!=null) list.offer(list.peek().right);
                sum = sum + list.poll().val;
            }
            res.add(sum/1.0/n);
        }
        return res;
    }
}
