import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ListIterator<Integer> it=ll.listIterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.previous());

        ll.addFirst(44);
        ll.addLast(67);
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.get(0));
    }
}


