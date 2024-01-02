class A{
    A(){
        System.out.println("This is A!");
    }
}
class B extends A{
    B(){
        System.out.println("This is B!");
    }
}
class C extends B{
    C(){
        System.out.println("This is C!");
    }
}
public class ConsEx{
    public static void main(String[] args){
        C c=new C();
    }
}