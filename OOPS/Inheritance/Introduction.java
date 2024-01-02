class Shape{
    String color;
    int sides;
}
class Triangle extends Shape{
    public void disp(){
        System.out.println("It has "+ this.sides+ " and of color "+ this.color);
    }
}
public class Introduction {
    public static void main(String[] args) {
            Triangle t1=new Triangle();
            t1.color="Blue";
            t1.sides=3;
            t1.disp();
    }
}
