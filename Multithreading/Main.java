class MainThread extends Thread{
    public MainThread(){
        super();
        start();
    }
    public void run(){
        System.out.println("From MainThread!");
    }
}
public class Main {
    public static void main(String[] args){
        MainThread t=new MainThread();
        System.out.println("From MainThread!");
    }
}
