// public class multipleCatch{
//     public static void main(String[] args){
//         try{
//             // System.out.println("Result is "+10/0);
//             //we should avoid these method of handling
//             String s=null;
//             int slen=s.length();
//             System.out.println("Length of "+s+" is "+slen);
//         }catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

import java.sql.SQLException;

public class multipleCatch{
    public static void main(String[] args){
        //the catch blocks should be always from child to parent
        //order of catch blocks are very important
        //first take child then parent catch's
        //you can't have same exceptions twice in catch blocks
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){  //child first
            System.out.println(e.getMessage());
        }catch(Exception e){  //later parent
            System.out.println(e);
        }
    }
}