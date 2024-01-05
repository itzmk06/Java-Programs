interface A{
    public void method1();
}
interface B{
    public void method2();
}
class Hello implements A,B{
    @Override
    public void method1(){
        System.out.println("Hello from method1");
    }
    @Override
    public void method2(){
        System.out.println("Hello from method2");
    }
}

public class Simple {
    public static void main(String[] args){
        Hello h=new Hello();
        h.method1();
        h.method2();
    }
}
