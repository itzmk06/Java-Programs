public class throwKeyword {
    public static void main(String[] args){
        try{
            throw new ArithmeticException("This is demo!");
        }catch(ArithmeticException e){
            System.out.println("Caugth an Exception :"+e.getMessage());
        }
    }
}


