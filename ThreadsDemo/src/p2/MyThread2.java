package p2;

public class MyThread2 extends Thread{
	
	Factorial f;
	
	public MyThread2(Factorial f) {
		super();
		this.f = f;
	}

	
	public void run()
	{
		try {
			f.fact(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
