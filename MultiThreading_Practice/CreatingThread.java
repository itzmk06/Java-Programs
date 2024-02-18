class NewThread implements Runnable{
    public Thread t;
    public NewThread(){
        t=new Thread(this,"Child");
    }
    @Override
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child : "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child thread interrupted!");
        }finally{
            System.out.println("Child thread exiting!");
        }
    }
}
public class CreatingThread{
    public static void main(String[] args){
        NewThread nt=new NewThread();
        nt.t.start();
        try{
            for(int i=5;i>0;i--){
                System.out.println("parent : "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Parent Thread interrupted!");
        }finally{
            System.out.println("Main thread exiting!");
        }
    }
}