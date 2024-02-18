import java.util.*;
public class ex4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1;
        int num2;
        try{
            
        }
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the "+n+" elements into array:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        try{
            int n_value;
            System.out.println("Enter index to access the array:");
            n_value=sc.nextInt();
            int item=arr[n_value];
            System.out.println("Found !");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Error occured :"+a.getMessage());
        }
    }
}
