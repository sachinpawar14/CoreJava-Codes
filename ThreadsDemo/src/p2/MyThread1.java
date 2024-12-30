package p2;

public class MyThread1 extends Thread{
	
	Factorial f;
	
	
	
	public MyThread1(Factorial f) {
		super();
		this.f = f;
	}



	public void run()
	{
		try {
			f.fact(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
