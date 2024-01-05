interface Shape{
    double CalculateArea();
    void show();
}
class Rectangle implements Shape{
    double l1;
    double l2;
    Rectangle(double a,double b){
        this.l1=a;
        this.l2=b;
    }
    @Override
    public double CalculateArea(){
        return (l1*l2);
    }
    @Override
    public void show(){
        System.out.println("Area of rectangle is "+CalculateArea());
    }
}
class Circle implements Shape{
    double r;
    Circle(double r){
        this.r=r;
    }
    @Override 
    public double CalculateArea(){
        return (3.14*this.r*this.r);
    }
    public void show(){
        System.out.println("Area of circle is "+CalculateArea());
    }
}
public class ShapeClass {
    public static void main(String[] args){
        Circle c=new Circle(2);
        Rectangle r=new Rectangle(10,20);
        c.show();
        r.show();
    }
}
