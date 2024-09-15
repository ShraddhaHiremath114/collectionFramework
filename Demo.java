import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Demo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        System.out.println(list);

        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(list);
    }
}
