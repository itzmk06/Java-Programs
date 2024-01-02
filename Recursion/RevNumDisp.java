import java.util.*;

public class RevNumDisp {
    public static void disp(int start,int number){
        if(start<=number){
            System.out.println(start);
            disp(start+1,number);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'n' value:");
        int number=sc.nextInt();
        int start=1;
        disp(start,number);
    }
    
}
