class NewThread extends Thread{
    NewThread(){
        super("Demo Thread");
        System.out.println("Created thread : "+this);
    }
    @Override
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("child : "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Terminated child thread");
        }finally{
            System.out.println("exiting child thread!");
        }
    }
}
public class ExtendingThread{
    public static void main(String[] args){
        NewThread nt=new NewThread();
        nt.start();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Parent : "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Parent thread interrupted!");
        }finally{
            System.out.println("Parent thread exiting!");
        }
    }
}