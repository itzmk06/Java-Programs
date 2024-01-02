import java.util.*;
public class PrimeCheck {
    public static void check(int number){
        int flag=1;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                flag=0;
                break;
            }
        }
        if(flag==0){
            System.out.println(number +" is not a prime number!");
        }else{
            System.out.println(number + " is a prime number!");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();
        check(number);
    }

}
// Enter number:21
// 21 is not a prime number!

// Enter number:73
// 73 is a prime number!