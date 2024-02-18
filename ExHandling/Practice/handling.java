import java.util.*;
public class handling {
    public static void main(String[] args){
        Random r=new Random();
        try{
            for(int i=0;i<1000;i++){
                int a=r.nextInt();
                int b=r.nextInt();
                int c=r.nextInt();
                double result=a/(b/c);
                System.out.println("Result of "+i+"th iteration is "+result);
            }
        }catch(Exception e){
                System.out.println("An error occured : "+e.getMessage());
            }
        }
}
