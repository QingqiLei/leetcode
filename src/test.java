import java.util.Deque;
import java.util.LinkedList;

public class test {
    public static void main(String[] args){
        Deque deque = new LinkedList();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque.getFirst());

    }
}
