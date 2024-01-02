import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements into array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int ele=arr[0];
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Selection sorted elements are as follows:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


//OUTPUT
// Enter size of array:10
// Enter 10 elements into array:
// 100
// -1
// 20
// -3
// 40
// 1000
// 4
// -12
// -333
// 577
// Selection sorted elements are as follows:
// -333 -12 -3 -1 4 20 40 100 577 1000