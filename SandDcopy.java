class A{
    int x=10;
}
class B{
    int y=20;
}
public class SandDcopy {
    public static void main(String[] args) {
        //Shallow copy
        A o1=new A();

        A o2=o1;

        o2.x=30;
        System.out.println(o1.x);


        //Deep copy
        B b1=new B();
        B b2=new B();
        b2.y=40;
        System.out.println(b1.y);
    }
}
