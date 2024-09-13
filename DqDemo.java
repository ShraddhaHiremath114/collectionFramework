import java.util.Deque;
import java.util.ArrayDeque;
public class DqDemo {
    public static void main(String[] args) {
        Deque dq=new ArrayDeque<>() ;
        //FIFO default
        dq.add(10);
        dq.add(20);
        // dq.addFirst(30);
        System.out.println(dq.poll());
        System.out.println(dq.peek());

        dq.addLast(40);
        System.out.println(dq.getLast());
        dq.removeFirst();
    }
}
