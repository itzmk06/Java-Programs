import java.util.*;
public class Binary_Search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements into array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int item;
        System.out.print("Enter the search element:");
        item=sc.nextInt();
        int ans=-1;
        int beg=0,end=arr.length-1;
        while(beg<=end){
            int mid=(beg)+(end-beg)/2;
            if(arr[mid]==item){
                ans=mid;
                break;
            }else if(arr[mid]>item){
                end=mid-1;
            }else{
                beg=mid+1;
            }
        }
        if(ans>0){
            System.out.println("We found "+item+" in the array at position "+ ans);
        }else{
            System.out.println("Sorry! we can't find "+ item +" in array!");
        }
    }
}

// Enter size of array:10
// Enter elements into array:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Enter the search element:6
// We found 6 in the array at position 5