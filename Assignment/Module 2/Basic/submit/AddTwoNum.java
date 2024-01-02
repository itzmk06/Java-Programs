import java.util.*;
public class AddTwoNum {
    public static void main(String[] args){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        x=sc.nextInt();
        System.out.print("Enter second number:");
        y=sc.nextInt();
        int sum=x+y;
        System.out.println("Sum of "+x+" and "+y+" is "+ sum);
        sc.close();
    }
}


// Enter first number:10
// Enter second number:20
// Sum of 10 and 20 is 30