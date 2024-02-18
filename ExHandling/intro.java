public class intro{
    public static void main(String[] args){
        System.out.println("Hello world! :)");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Encountered an exception "+e.getMessage());
        }
        System.out.println("Hello Manoj!<3");
    }
}