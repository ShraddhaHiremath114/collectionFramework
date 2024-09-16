import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterfaceDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Shraddha");
        list.add("Viresh");
        list.add("Suvarna");
        list.add("Dhanu");
        list.add("abc");
        
        
        Iterator<String> it=list.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        /*
         * List<Integer> list=new ArrayList<>();
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
     
        */
        //complete collections
    }
}
