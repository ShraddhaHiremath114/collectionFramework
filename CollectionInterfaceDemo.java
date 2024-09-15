import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        Collection<String> colln=new ArrayList<>();

        List<String> list=new ArrayList<>();

        //1. add(E e) - add element 
        list.add("Lily");
        list.add("Hibiscus");

        colln.add("Rose");
        System.out.println(colln);
        //2. addAll(Collection c) - add All the elements of specified collection
        colln.addAll(list);
        System.out.println(colln);

        // System.out.println(colln.contains("shraddha"));
        // System.out.println(colln.contains("Lily"));
        // System.out.println(colln.containsAll(list));
        // System.out.println(colln.hashCode());
        // System.out.println(colln.parallelStream());
        // System.out.println(colln);
        // System.out.println(colln.remove("shra"));
        // System.out.println(colln);
        System.out.println(colln.retainAll(list));//intersection
        System.out.println(colln);
        // colln.remove("Lily");
        // colln.removeAll(list);
        // System.out.println(colln);

        // colln.clear();
        // System.out.println(colln);
        // System.out.println(colln.isEmpty());

        System.out.println(colln.size());

        // System.out.println(list.equals(colln));

        String[] arr=new String[3];
        arr=colln.toArray(arr);

        for(String val:arr){
            System.out.println(val+" ");
        }
       
        String a[]=list.toArray(new String[0]);
        for(String val:a)System.out.print(val+" ");
    }
}
