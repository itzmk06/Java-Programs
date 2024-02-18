public class intro{
    public static void main(String[] args){
        Thread t=Thread.currentThread();
        System.out.println("Current Thread info : "+t);
        t.setName("MyThread");
        System.out.println("After name change : "+t);
        try{
            for(int i=5;i>0;i--){
                System.out.println("Value of i :"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName()+" got interrupted!");
        }
        finally{
            System.out.println("Executed everything!");
        }
    }
}