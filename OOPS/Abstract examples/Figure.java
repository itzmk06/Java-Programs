abstract class A{
    double dim1;
    double dim2;
    A(double a,double b){
        this.dim1=a;
        this.dim2=b;
    }
    void show(){
        System.out.println("Area of undefined is undefined!");
    }
    abstract double area();
}
class Rectangle extends A{
    Rectangle(double dim1,double dim2){
        super(dim1,dim2);
    }
    double area(){
        return dim1*dim2;
    }
    void show(){
        System.out.println("Area of rectangle is "+area());
    }
}class Square extends A{
    Square(double dim1,double dim2){
        super(dim1,dim2);
    }
    double area(){
        return dim1*dim2;
    }
    void show(){
        System.out.println("Area of square is "+area());
    }
}
public class Figure{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10, 20);
        Square s=new Square(20, 30);
        A a;
        // a.area();
        // a.show(); will generate errors
        a=r;
        a.area();
        a.show();
        a=s;
        a.area();
        a.show();
    }
}