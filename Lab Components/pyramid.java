import java.util.*;
public class pyramid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns:");
        int column=sc.nextInt();
        //print the pattern
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}