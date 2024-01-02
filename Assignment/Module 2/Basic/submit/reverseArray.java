import java.util.*;
public class reverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int beg=0,end=arr.length-1;
        while(beg<end){
            int temp=arr[beg];
            arr[beg]=arr[end];
            arr[end]=temp;
            beg++;
            end--;
        }
        System.out.println();
        System.out.println("Reversed array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

// OUTPUT---------------------------------------------------------------
// Original array:
// 10 20 30 40 50
// Reversed array:
// 50 40 30 20 10