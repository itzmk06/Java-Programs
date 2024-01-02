import java.util.*;

public class BinarySearch1{
    public static void main(String[] args){
        System.out.println("Enter the value of N:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search element:");
        int ele=sc.nextInt();
        int beg=0,end=n-1,pos=-1,found=0;
        while(beg<=end){
            int mid=(beg+(end-beg)/2);
            if(arr[mid]==ele){
                found=1;
                pos=mid;
                break;
            }else if(ele>arr[mid]){
                end=mid-1;
            }else{
                beg=mid+1;
            }
        }
        if(found==1){
            System.out.println("Found "+ele+" at index "+pos);
        }else{
            System.out.println("Sorry! we can't find "+ele+" in the given array!");
        }
    }
}