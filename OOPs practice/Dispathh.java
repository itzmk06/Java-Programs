class A{
    void show(){
        System.out.println("This is from A");
    }
}
class B extends A{
    void show(){
        System.out.println("This is from B");
    }
}
class C extends A{
    void show(){
        System.out.println("This is from C");
    }
}
public class Dispathh {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        C c=new C();

        A ob;
        ob=a;
        ob.show();
        ob=b;
        ob.show();
        ob=c;
        ob.show();
    }
}
