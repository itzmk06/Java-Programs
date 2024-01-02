import java.util.*;
public class BubleSortImp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' value:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" elements into array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //implementing bubble sort
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The sorted elements are as follows:");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
    }
}
