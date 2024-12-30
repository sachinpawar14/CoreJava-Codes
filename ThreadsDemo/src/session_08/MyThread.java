package session_08;
public class MyThread extends Thread implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "
	+Thread.currentThread().getId());
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();//thread-0
		MyThread t2 = new MyThread();//thread-1
		MyThread t3 = new MyThread();//thread-2
		//t1,t2,t3 - born state
		t1.setName("one");
		t2.setName("two");
		t3.setName("three");
		t1.start();
		t2.start();
		t3.start();//runnable state
	}
}
