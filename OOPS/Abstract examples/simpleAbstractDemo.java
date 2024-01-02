abstract class A{
    abstract void display();
    void show(){
        System.out.println("This is from A");
    }
}
class B extends A{
    void display(){
        System.out.println("B implementing display");
    }
    void show(){
        System.out.println("This is from B");
    }
}
public class simpleAbstractDemo {
    public static void main(String[] args){
        B b=new B();
        b.display();
        b.show();
    }
}
