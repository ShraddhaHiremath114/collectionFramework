import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Set;
import java.lang.Integer;
import java.util.SortedSet;
import java.util.TreeSet;
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
        // System.out.println(lhs);
        // for(int v:lhs)System.out.print(v+" ");
        // System.out.println();
        // Iterator<Integer> it=set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
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
        System.out.println(set.retainAll(s2));

        // s2.clear();
        // System.out.println(s2.isEmpty());
        // System.out.println(set.contains(10));

        // System.out.println(s2.size());

        // Integer arr[]=new Integer[3];
        // arr=set.toArray(arr);

        // Integer a[]=set.toArray(new Integer[0]);
        // for(int val:a)System.out.print(val+" ");

        // NavigableSet<Integer> ns=new TreeSet<>();
        // ns.add(1);
        // ns.add(3);
        // ns.add(7);
        // ns.add(4);
        // System.out.println(ns);
        // System.out.println(ns.floor(2));//equals or just lesser value
        // System.out.println(ns.ceiling(5));//equals or just greater value

        SortedSet<Integer> ss=new TreeSet<>();
        ss.add(30);
        ss.add(70);
        ss.add(10);
        ss.add(40);
        ss.add(15);
        System.out.println(ss);
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(60));
        System.out.println(ss.tailSet(60));
    }
}
