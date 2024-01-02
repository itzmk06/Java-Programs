class A{
    public int a;
    public int b;
    public void showAB(){
        System.out.println("A is "+a+" B is "+b);
    }
}
class B extends A{
    public int c;
    public void showABC(){
        System.out.println("A is "+a+" B is "+b+" C is "+c);
    }
}
public class SimpleInheritance{
    public static void main(String[] args){
        A supOb=new A();
        B subOb=new B();
        //creating objects of  super class
        supOb.a=10;
        supOb.b=20;
        supOb.showAB();
        //creating objects of sub class
        subOb.a=30;
        subOb.b=40;
        subOb.c=50;
        subOb.showABC();
    }
}