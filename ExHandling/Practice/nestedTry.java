public class nestedTry {
    public static void main(String[] args){
        try{
            try{
                int a=10;
                int b=0;
                int result=a/b;
                System.out.println("Result is "+result);
            }catch(NullPointerException e){
                System.out.println("Handled by inside catch!");
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println("Handled by outside catch!");
            System.out.println(e);
        }
    }
}
