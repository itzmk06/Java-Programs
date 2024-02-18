class Main extends Thread{
    public Main(){
        super();
        start();
    }
    public void run(){
        System.out.println("Base class here!");
    }
}
public class MyThread{
    public static void main(String[] args){
        Main myThread = new Main();
        System.out.println("From Main class here");
    }
}