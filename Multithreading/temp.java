public class temp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        
        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " started.");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
