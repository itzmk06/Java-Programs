import java.util.*;
interface Number{
    public void readValues();
    public void ascendingOdrer();
    public void decOrder();
}
class Sort implements Number{
    Scanner sc=new Scanner(System.in);
    int n;
    int[] arr;
    @Override
    public void readValues(){
        System.out.println("Enter size of array:");
        this.n=sc.nextInt();
        this.arr=new int[n];
        System.out.println("Enter "+n+" elements into array:");
        for(int i=0;i<n;i++){
            this.arr[i]=sc.nextInt();
        }
    }
    @Override
    public void ascendingOdrer(){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Elements in ascending order are as follows:");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    @Override
    public void decOrder(){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The descending array elements are as follows:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class SortThis {
    public static void main(String[] args){
        Sort s=new Sort();
        s.readValues();
        s.ascendingOdrer();
        s.decOrder();
    }
}


// output
// Enter size of array:
// 6
// Enter 6 elements into array:
// 2
// 5
// 7
// 1
// 2
// 5
// Elements in ascending order are as follows:
// 1 2 2 5 5 7
// The descending array elements are as follows:
// 7 5 5 2 2 1