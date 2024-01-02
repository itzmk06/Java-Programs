//Finds the sum of first n natural numbers provided n value
import java.util.*;
public class SumN{
    public static void disp(int number,int sum){
        if(number>0){
            sum+=number;
            disp(number-1,sum);
        }
        if(number==0){
            System.out.print("Sum of is "+ sum);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int number=sc.nextInt();
        int sum=0;
        disp(number,sum);
    }
}