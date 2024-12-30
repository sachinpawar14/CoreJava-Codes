package session_08;
public class MyThread1 extends Thread{
		public void run()
		{
			for(int i=1;i<=3;i++)
			{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}}
		
		public static void main(String[] args) {
			MyThread1 t1 = new MyThread1();//thread-0
			MyThread1 t2 = new MyThread1();//thread-1
			MyThread1 t3 = new MyThread1();//thread-2
			//t1,t2,t3 - born state
			t1.setName("one");
			t2.setName("two");
			t3.setName("three");
			t1.start();
			t2.start();
			t3.start();//runnable state
		}	}

