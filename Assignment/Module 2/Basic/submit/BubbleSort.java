import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements into array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The bubble sorted elements are as follows:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

// OUTPUT-------------------------------------------------------------------
// Enter size of array:
// 10
// Enter 10 elements into array:
// 1
// 2
// 3
// 11
// 66
// -10
// 8
// 3
// 2
// 1
// The bubble sorted elements are as follows:
// -10 1 1 2 2 3 3 8 11 66