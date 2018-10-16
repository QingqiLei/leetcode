package tree.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * the difference of preorder and postorder is not noly the order of operation and recursion, also can go to left firstly or go the the right firstly
 */
public class NaryTreePreorderTraversal589 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) return list;

        list.add(root.val);
        for (Node node : root.children)
            preorder(node);

        return list;
    }

    public List<Integer> preorder2(Node root) {
        List<Integer> list = new ArrayList();
        if (root == null) return list;


        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--)      // oh my facking gosh
                stack.push(root.children.get(i));

        }
        return list;


    }
}
