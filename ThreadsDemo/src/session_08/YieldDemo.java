package session_08;
public class YieldDemo implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=4;i++)
		{
			if(i==2)
			{
				Thread.yield();
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new YieldDemo());
		Thread t2 = new Thread(new YieldDemo());
		Thread t3 = new Thread(new YieldDemo());
		t1.setName("one");
		t2.setName("two");
		t3.setName("three");
		t1.start();
		t2.start();
		t3.start();	
	}
}
