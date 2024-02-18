public class methods{
    public static void main(String[] args){
        try{
            System.out.println("The div result is "+10/0);
        }catch(ArithmeticException e){
            // e.printStackTrace();  // gives complete information
            // System.out.println(e.toString());  //provides just description on error but no stacktrace
            // System.out.println(e); //toString() is called internally
            System.out.println(e.getMessage()); //provides only description but no error info
        }
    }
}