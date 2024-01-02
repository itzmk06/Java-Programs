import java.util.*;
public class DispNum{
    public static void disp(int number){
        if(number>0){
        System.out.println(number);
        disp(number-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int number=sc.nextInt();
        disp(number);
    }
}