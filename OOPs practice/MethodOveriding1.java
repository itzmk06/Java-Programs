class A{
    int a;
    int b;
    A(int a,int b){
        this.a=a;
        this.b=b;
    }
    A(){
        this.a=-1;
        this.b=-1;
    }
    void show(){
        System.out.println("Value of a is "+this.a+" value of b is "+this.b);
    }
}
class B extends A{
    int c;
    B(){
        this.c=-1;
    }
    B(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    void show(){
        System.out.println("Value of b is "+this.a+" value of b is "+this.b+" value of c is "+c);
    }
}
public class MethodOveriding1 {
    public static void main(String[] args){
        B b=new B(10,20,30);
        A a=new A(10,20);
        b.show();
        a.show();
    }
}
