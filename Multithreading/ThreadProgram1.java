class MyRunnable implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("BEFORE SLEEP:");
            System.out.println("We have started "+Thread.currentThread().getName());
            System.out.println("Id of "+Thread.currentThread().getName()+"is"+Thread.currentThread().getId());
            System.out.println("Priority of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
            System.out.println("is alive: "+Thread.currentThread().isAlive());
            System.out.println("is demon: "+Thread.currentThread().isDaemon());
            System.out.println("active count :"+Thread.activeCount());
            System.out.println("Called yield!");
            Thread.yield();
            Thread.sleep(500);
            System.out.println();
            System.out.println("We have completed "+Thread.currentThread().getName());
        }catch(InterruptedException e){
            e.getStackTrace();
        }
    }
}

public class ThreadProgram1 {
    public static void main(String[] args){
        Thread t1=new Thread(new MyRunnable(),"Thread 1");
        Thread t2=new Thread(new MyRunnable(),"Thread 2");
        t1.start();
        t2.start();
    }
}
