package tree.easy;


import java.util.*;

public class NaryTreePostorderTraversal590 {
    static List<Integer> list = new ArrayList();
    static LinkedList<Integer> list1 = new LinkedList<Integer>();

    public static List<Integer> postorder(Node root) {
        if (root == null) return list1;


        for (Node child : root.children) {
            postorder(child);
        }

        list1.add(root.val);

        return list1;
    }

    public List<Integer> postorder2(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for (Node node : root.children)
                stack.add(node);
        }
        Collections.reverse(list);
        return list;


    }


    public static void main(String[] args) {

    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
