import java.util.*;

public class Fibanoci {
    public static void disp(int number,int n1,int n2,int sum,int count) {
        if(count<number){
            System.out.println(n1);
            sum=n1+n2;
            n1=n2;
            n2=sum;
        disp(number,n1,n2,sum,count+=1);}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n size:");
        int number=sc.nextInt();
        int n1=0;
        int n2=1;
        int sum=n1+n2;
        int count=0;
        disp(number,n1,n2,sum,count);
    }
}
