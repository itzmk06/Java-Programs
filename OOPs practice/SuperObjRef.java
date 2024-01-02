class A{
    int x=10;
    int y=20;
}
class B extends A{
    int z=30;
}
public class SuperObjRef{
    public static void main(String[] args){
        System.out.println("Hello,World!");
        B b=new B();
        A a=new A();
        a=b;
        System.out.println("This is from sub class:");
        System.out.println("x is "+b.x);
        System.out.println("y is "+b.y);
        System.out.println("z is "+b.z);
        System.out.println("This is from super class:");
        System.out.println("x is "+a.x);
        System.out.println("y is "+a.y);
        // System.out.println("z is "a.z) ; super class can't access sub class objects
    }
}