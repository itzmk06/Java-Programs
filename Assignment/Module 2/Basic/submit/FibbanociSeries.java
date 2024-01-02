import java.util.*;
public class FibbanociSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' value:");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.println("Fibbanoci Series are as follows:");
        while(n>=0){
            System.out.print(n1+" ");
            int temp=n1+n2;
            n1=n2;
            n2=temp;
            n--;
        }
        sc.close();
    }
}

//OUTPUT

// Enter 'n' value:10
// Fibbanoci Series are as follows:
// 0 1 1 2 3 5 8 13 21 34 55