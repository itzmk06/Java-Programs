class NewThread implements Runnable{
    Thread t;
    String name;
    NewThread(String name){
        this.name=name;
        t=new Thread(this,this.name);
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(Thread.currentThread()+" : "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(Thread.currentThread()+" got terminated!");
        }finally{
            System.out.println("Exiting "+Thread.currentThread());
        }
    }
}
public class DemoThread {
    public static void main(String[] args){
        NewThread nt1=new NewThread("one");
        NewThread nt2=new NewThread("two");
        NewThread nt3=new NewThread("three");
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        System.out.println("Is one alive : "+nt1.t.isAlive());
        System.out.println("Is two alive : "+nt2.t.isAlive());
        System.out.println("Is three alive : "+nt3.t.isAlive());
        try{
            System.out.println("Wating for threads to finish!");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted"+Thread.currentThread().getName());
        }
        System.out.println("Is one alive : "+nt1.t.isAlive());
        System.out.println("Is two alive : "+nt2.t.isAlive());
        System.out.println("Is three alive : "+nt3.t.isAlive());
        System.out.println("Exiting main thread!");
    }
}
