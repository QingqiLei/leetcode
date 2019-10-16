package stack.monotone;

import java.util.Stack;

public class AsteroidCollision735 {
    public static int[] asteroidCollision(int[] a) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            collision:
            {
                while (!stack.isEmpty() && a[i] < 0 && stack.peek() > 0) {
                    if (-a[i] > stack.peek()) { //  不运行下面的代码，直接下一次while循环，
                        stack.pop();
                        continue;
                    } else if (-a[i] == stack.peek()) {  //不push， 直接到push 那一行的下一行
                        stack.pop();

                    }
                    break;
                }

                stack.push(a[i]);
            }

        }
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) res[i] = stack.pop();
        return res;
    }

    public static void main(String[] args){
        asteroidCollision(new int[]{10,15,-15,-20});
    }
}
