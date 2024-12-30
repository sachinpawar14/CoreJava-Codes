package p2;

public class Factorial {
	
	public synchronized void fact(int no) throws InterruptedException
	{
		int fact = 1;
		for(int i=1;i<=no;i++)
		{
			fact = fact*i;
			Thread.sleep(100);
			System.out.println(fact);
		}
	}

}
