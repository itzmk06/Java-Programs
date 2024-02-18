public class multiple_catch {
    public static void main(String[] args){
        try{
            int a=args.length;
            int b=6/a;    //TODOgive some values from commandline while running
            int c[]={1};
            c[34]=10;
            System.out.println("Sucessfull!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("This will be executed no matter what will happen!");
        }
    }
}
