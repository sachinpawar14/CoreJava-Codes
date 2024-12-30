package session_08;
public class MyThread2 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" "
				+ ""+Thread.currentThread().getPriority());	
	}
	
	public static void main(String[] args) {
		MyThread2 r1 = new MyThread2();
		Thread t1 = new Thread(r1);
		MyThread2 r2 = new MyThread2();
		Thread t2 = new Thread(r2);
		MyThread2 r3 = new MyThread2();
		Thread t3 = new Thread(r3);
		//NORM_PRIORITY - 5
		t1.start();
		t2.start();
		t3.start();
	}
}
