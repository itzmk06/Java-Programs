class A{
    public void method1(){
        System.out.println("This is from base class! method1");
    }
}
interface B{
    public void method2();
}
interface C{
    public void method3();
}
class D extends A implements B,C{
    @Override
    public void method1(){
        System.out.println("This is from sub class! method 1");
    }
    public void method2(){
        System.out.println("This is from sub class method2");
    }
    public void method3(){
        System.out.println("This is from sub class method3");
    }
}
public class Simple {
    public static void main(String[] args){
        D d=new D();
        d.method1();
        d.method2();
        d.method3();
    }
}
