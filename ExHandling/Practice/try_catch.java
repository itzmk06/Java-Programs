public class try_catch {
    public static void main(String[] args){
        try{
            int num1=10;
            int num2=0;
            double result=num1/num2;
            System.out.println("Result is "+result);
        }catch(ArithmeticException e){
            System.out.println("Error occured: "+e.getMessage());
        }
    }
}
