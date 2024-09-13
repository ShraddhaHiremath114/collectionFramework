import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.Integer;
public class SetsDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(20);

        Set<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        System.out.println(lhs);
        for(int v:lhs)System.out.print(v+" ");
        System.out.println();
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // System.out.println(set);

        //addAll->Union
        Set<Integer> s2=new HashSet<>();
        s2.add(10);
        s2.add(50);
        s2.add(80);

        // System.out.println(set);
        // System.out.println(s2);
        // set.addAll(s2);
        // System.out.println(set);//it will change
        // System.out.println(s2);//it will not

        //containsAll
        // System.out.println(set.containsAll(s2));//false//if set contains all elements of sets2 then true ow false
        // set.add(50);
        // set.add(80);
        // System.out.println(set.containsAll(s2));//true

        //difference
        // System.out.println(set);
        // System.out.println(s2);
        // System.out.println(set.removeAll(s2));
        // System.out.println(s2.removeAll(set));
        // System.out.println(set);
        // System.out.println(s2);

        //retailAll-> common / intersection
        // System.out.println(set.retainAll(s2));

        // s2.clear();
        // System.out.println(s2.isEmpty());
        // System.out.println(set.contains(10));

        // System.out.println(s2.size());

        // Integer arr[]=new Integer[3];
        // arr=set.toArray(arr);

        // Integer a[]=set.toArray(new Integer[0]);
        // for(int val:a)System.out.print(val+" ");
    }
}
