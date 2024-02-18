package concurrent;
// import java.util.concurrent.*;
public class MultithreadingIntroUser {
	public static void main(String[] args) {
		Runnable first=new PrintNum(6,300);
		Runnable second=new PrintChar('a',200);
		Thread t1=new Thread(first);
		Thread t2=new Thread(second);
		t1.start();
		t2.start();
	}
}

class PrintNum extends Thread{
	private int num;
	private int times;
	
	@Override
	public void run() {
		for(int i = 0; i < times; i++) {
			System.out.print(num);
		}
	}
	
	public PrintNum(int num1, int times1) {
		num = num1;
		times = times1;
	}
}

class PrintChar implements Runnable{
	private char letter;
	private int times;
	
	@Override
	public void run() {
		for(int i = 0; i < times; i++) {
			System.out.print(letter);
		}
	}
	
	public PrintChar(char letter1, int times1) {
		letter = letter1;
		times = times1;
	}
	
}
