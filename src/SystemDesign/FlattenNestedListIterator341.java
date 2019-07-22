package SystemDesign;

import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

   interface NestedInteger {

              // @return true if this NestedInteger holds a single integer, rather than a nested list.
              public boolean isInteger();

             // @return the single integer that this NestedInteger holds, if it holds a single integer
              // Return null if this NestedInteger holds a nested list
              public Integer getInteger();

              // @return the nested list that this NestedInteger holds, if it holds a nested list
              // Return null if this NestedInteger holds a single integer
              public List<NestedInteger> getList();
  }

public class FlattenNestedListIterator341 {
    Stack<ListIterator<NestedInteger>> stack;
    public FlattenNestedListIterator341(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        stack.push(nestedList.listIterator());
    }

    public Integer next() {
        return stack.peek().next().getInteger();
    }

    public boolean hasNext() {
        while(!stack.isEmpty()){
            if(!stack.peek().hasNext()) stack.pop();
            else {
                NestedInteger x = stack.peek().next();
                if (x.isInteger()) return stack.peek().previous() == x;
                stack.push(x.getList().listIterator());
            }

        }
        return false;
    }

}
