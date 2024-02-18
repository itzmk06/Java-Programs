import java.util.*;
public class ex7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String var=null;
        try{
            int len=var.length();
            System.out.println("The length of string is "+len);
        }
        catch(NullPointerException e){
            System.out.println("Error occured :"+e.getMessage());
        }
    }
}
