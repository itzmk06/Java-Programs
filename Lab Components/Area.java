import java.util.*;
public class Area {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first side:");
        int a=sc.nextInt();
        System.out.print("Enter second size:");
        int b=sc.nextInt();
        // calculate area of rect
        float rectArea=a*b;
        float squareArea=a*b;
        System.out.println("The area of rectangle is "+rectArea);
        System.out.println("The area of square is "+squareArea);
    }
}
