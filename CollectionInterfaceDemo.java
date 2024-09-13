import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        Collection<String> colln=new ArrayList<>();

        List<String> list=new ArrayList<>();
        list.add("Lily");
        list.add("Hibiscus");

        colln.add("Rose");
        colln.addAll(list);
        System.out.println(colln);

        // colln.remove("Lily");
        // colln.removeAll(list);
        System.out.println(colln);

        // colln.clear();
        System.out.println(colln.isEmpty());

        System.out.println(colln.size());

        System.out.println(list.equals(colln));

        String[] arr=new String[3];
        arr=colln.toArray(arr);

        for(String val:arr){
            System.out.println(val+" ");
        }
        
    }
}
