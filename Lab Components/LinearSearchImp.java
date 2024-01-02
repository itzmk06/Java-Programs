import java.util.*;
public class LinearSearchImp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' value:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter "+n+" elements into array:\n");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter search element: ");
        int item=sc.nextInt();
        //Implement linear search 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println(item+" is found at index "+ i);
                break;
            }
        }
        System.out.println("Thank You!");
    }
}