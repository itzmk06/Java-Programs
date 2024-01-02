import java.util.*;
public class BinarySearchImp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' value:");
        int n=sc.nextInt();
        System.out.print("Enter the search element:");
        int ele=sc.nextInt();
        // declare an array of type int 
        int[] arr=new int[n];
        System.out.print("Enter "+n+" elements into array:");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
        int beg=0,end=n-1;
        int found=0;
        int pos=-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(arr[mid]==ele){
                found=1;
                pos=mid;
                break;
            }else if(ele<arr[mid]){
                end=mid-1;
            }else{
                beg=mid+1;
            }
        }
        if (found==1){
            System.out.print(ele+" found at index "+pos);
        }else{
            System.out.print("Sorry! we can't find "+ele+" in array!!");
        }
    }
}