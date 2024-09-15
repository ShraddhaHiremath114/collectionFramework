import java.util.ArrayList;
import java.util.List;


public class ArrayListDemo{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();//It is possible to create reference of super class and object of chile class.
        //A obj=new B();//What it tells that obj is of type A.
        
        //Adding

        list.add(10);
        list.add(20);
        list.add(30);
        // System.out.println(list);
        list.add(1,50);
        // System.out.println(list);

        List<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(2);
        list.addAll(li);
        list.addAll(1,li);
        // System.out.println(list);

        li.clear();
        // System.out.println(li);

        // System.out.println(list);
        list.removeAll(li);
        //contains

        // System.out.println(list.contains(20));
        // System.out.println(list.contains(80));

        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        int[] arr={10,20,30};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(l.contains(arr[i])){
                sum+=arr[i];
            }
        }
        // System.out.println(sum);

        // System.out.println(l.get(0));
        // System.out.println(l.indexOf(20));//if not present then -1

        l.remove(1);
        // System.out.println(l);

        l.set(1,20);
        // System.out.println(l);
        // System.out.println(l.size());

        Integer a[]=new Integer[3];
        a=l.toArray(a);

        // System.out.println(l);

        List<Integer> slist=l.subList(0, 2);//it will do shallow copy
        // System.out.println(slist);
        slist.add(28);
        
        slist.set(1, 100);
        // System.out.println(slist);
        // System.out.println(l);


        //Best practice to use toArray()
        Integer myarr[]=l.toArray(new Integer[0]);
        // for(int val:myarr)System.out.print(val+" ");




        //List Interface methods

        
        List<String> al=new ArrayList<>();//List is an interface so Cannot instantiate the type List

        //add(),add(i,e)
        al.add("shraddha");
        al.add("A");
        al.add("B");
        al.add("A");
        System.out.println(al);
        al.add(1, "Viresh");
        System.out.println(al);

        //set(i,e)- it will update its value
        al.set(1, "Val");
        // System.out.println(al);

        // System.out.println(al.indexOf("A"));
        // System.out.println(al.lastIndexOf("A"));
        // System.out.println(al.indexOf("S"));
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        al.remove("A");
        System.out.println(al);
        al.remove("S");
        System.out.println(al);

        System.out.println(al.contains("A"));

        System.out.println(al.get(2));
    }
}