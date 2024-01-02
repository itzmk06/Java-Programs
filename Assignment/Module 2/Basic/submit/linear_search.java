import java.util.*;
public class linear_search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements into array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search element:");
        int ele=sc.nextInt();
        int found=0;
        int pos=-1;
        for(int i=0;i<n;i++){
            if(ele==arr[i]){
                found=1;
                pos=i;
                break;
            }else{
                found=0;
            }
        }
        if(found==1){
            System.out.println(ele+" found at index "+ pos);
        }else{
            System.out.println("Sorry! We can't find "+ele+" in the given array!!");
        }
        sc.close();
    }
}

//OUTPUT-----------------------------------------------------------------
// Enter size :5   {case 1}
// Enter 5 elements into array:
// 1
// 2
// 3
// 4
// 5
// Enter the search element:
// 3
// 3 found at index 2
//-------------------------------------------------------------------------
// Enter size :5  {case 2}
// Enter 5 elements into array:
// 1
// 2
// 3
// 4
// 5
// Enter the search element:
// 6
// Sorry! We can't find 6 in the given array!!
