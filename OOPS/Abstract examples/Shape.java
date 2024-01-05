abstract class TheShape{
    double a;
    double b;
    String color;
    TheShape(double len1,double len2,String color){
        this.a=len1;
        this.b=len2;
        this.color=color;
    }
    abstract double CalculateArea();
    abstract void show();
    String getColor(){
        return color;
    }
}
class Rectangle extends TheShape{
    Rectangle(double a,double b,String color){
        super(a,b,color);
    }
    double CalculateArea(){
        return (super.a*super.b);
    }
    void show(){
        System.out.println("Area of rectangle is "+CalculateArea());
        System.out.println("Color of rectangle  is "+getColor());
    }
}
class Circle extends TheShape{
    Circle(double r,double g,String color){
        super(r,0,color);
    }
    double CalculateArea(){
        return (3.14*super.a*super.a);
    }
    void show(){
        System.out.println("Area of circle is "+CalculateArea());
        System.out.println("Color of circle is "+getColor());
    }
    
}
public class Shape{
    public static void main(String[] args){
        Rectangle r=new Rectangle(10, 20,"Purple");
        Circle c=new Circle(10, 1,"Blue");
        TheShape ob;
        ob=r;
        r.show();
        ob=c;
        c.show();
    }
}