import java.util.*;

interface Shape{
    public void ReadDimentions(double width,double hieght,double lenght);
    public void CalculatePerimeter();
    public void CalculateArea();
}
class Triangle implements Shape{
    double w;
    double h;
    double l;
    Triangle(){
        this.w=0;
        this.h=0;
        this.l=0;
    }
    Scanner sc=new Scanner(System.in);
    Triangle(double w,double h,double l){
        this.w=w;
        this.h=h;
        this.l=l;
    }
    @Override
    public void ReadDimentions(double width,double height,double lenght){
        System.out.println("Enter width:");
        this.w=sc.nextDouble();
        System.out.println("Enter height:");
        this.h=sc.nextDouble();
        System.out.println("Enter length:");
        this.l=sc.nextDouble();
    }
    @Override
    public void CalculatePerimeter(){
        double perimeter=this.h+this.w+this.l;
        System.out.println("Perimeter of triangle is "+perimeter);
    }
    @Override
    public void CalculateArea(){
        double area=(0.5*this.l*this.h*this.w);
        System.out.println("Area of triangle is "+area);
    }
}
public class What {
    public static void main(String[] args){
        Triangle t=new Triangle();
        t.ReadDimentions(0, 0, 0);
        t.CalculatePerimeter();
        t.CalculateArea();
    }
}
