public class ex5 {
    public static void main(String[] args){
        String name=null;
        try{
            int len=name.length();
            System.out.println("The length of "+name+" is "+len);
        }
        catch(NullPointerException e){{
            System.out.println("Error occurred :"+e.getMessage());
        }}
    }
}
