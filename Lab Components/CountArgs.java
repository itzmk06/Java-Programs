public class CountArgs {
    public static void main(String[] args){
        int size=args.length;
        System.out.println("The count is "+size);
            for (int i=0;i<size;i++){
                System.out.println("The elements are "+args[i]+" ");
            }
    }    
}
