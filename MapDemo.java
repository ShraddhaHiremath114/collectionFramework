import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"shraddha");
        map.put(2,"Heena");
       
        map.put(1,"Shree");
        // System.out.println(map);

        String val=map.get(1);
        // System.out.println(val);
        // System.out.println(map.get(8));//null if value is not present
        
        map.remove(2);
        // System.out.println(map.size());
        // System.out.println(map.containsKey(1));
        // System.out.println(map.containsValue("Shraddha"));
        // System.out.println(map.isEmpty());

        Map<Integer,Integer> lm=new LinkedHashMap<>();//Sorted according to keys
        lm.put(1, 100);
        lm.put(2,800);
        lm.put(5,300);
        lm.put(7, 400);

        System.out.println(lm);

        //HashMap & HashTable
        // Map<Integer,String> hm=new HashMap<>();
        // hm.put(1,"a");
        // hm.put(2, null);
        // hm.put(3, null);
        // System.out.println(hm);

        // Map<Integer,String> ht=new Hashtable<>();
        // ht.put(1, "A");
        // ht.put(2,null);//null pointer exception
        // System.out.println(ht);
    }
}
