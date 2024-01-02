import java.util.*;
public class Add {
    public static void main(String[] args){
        System.out.print("Enter number 1:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter number 2:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+ sum);
    }
    
}
