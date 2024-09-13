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
        
    }
}
