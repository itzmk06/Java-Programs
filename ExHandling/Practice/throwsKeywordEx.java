public class throwsKeywordEx {
    public static void t() throws IllegalAccessException{
        System.out.println("Inside t!");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args){
        try{
            t();
        }catch(IllegalAccessException e){
            System.out.println("Caught :"+e.getMessage());
        }
    }
}
