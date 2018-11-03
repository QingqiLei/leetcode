package stack.easy;

import java.util.Stack;

public class MinStack155 {
    long min;
    Stack<Long> stack;
    public MinStack155(){
        stack=new Stack();
    }

    public void push(int x){
        if(stack.isEmpty()){
            stack.push(0l);
            min = x;
        }else {
            stack.push(x - min);
            if(x < min) min = x;
        }

    }

    public void pop(){
        if(stack.peek() < 0) min = min - stack.peek();
    }

    public int top(){
        if(stack.peek() > 0)
            return (int)(stack.peek() + min);

        else return (int)(min);

    }

    public int getMin(){
        return (int)min;
    }
}

class solution2{

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack=new Stack<>();

    public void push(int x){
        if(x<=min){
            stack.push(min);
            min = x;
        }
            stack.push(x);

    }

    public void pop(){
        if(stack.peek() == min) {
            stack.pop();
            min = stack.pop();
        }else
            stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return min;
    }
}
//
//    Stack<Integer> stack=new Stack<>();
//    int min=Integer.MAX_VALUE;
//    public void push(int x) {
//        if(x<=min) {stack.push(min); min=x;}
//        stack.push(x);
//    }
//    public void pop() {
//        if(stack.peek()==min){ stack.pop(); min=stack.pop(); }
//        else stack.pop();
//    }
//    public int top() {
//        return stack.peek();
//    }
//    public int getMin() {
//        return min;
//    }


