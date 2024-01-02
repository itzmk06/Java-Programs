import java.util.*;
public class Factorial {
    public static int  findFact(int n){
        int fact=1;
        if(n>1){
            fact=n*findFact(n-1);
        }
        return fact;
    }  

    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' value:");
        int n=sc.nextInt();
        int result=findFact(n);
        System.out.println("Factorial is "+result);

    }
    
}
