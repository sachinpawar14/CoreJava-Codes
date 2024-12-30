package session_09;
public class Customer {
int amount = 5000;
	
	public synchronized int withdraw(int amount)
	{
		System.out.println("Performing Withdrawl");
		if(this.amount<amount)
			System.out.println("Insufficient Funds!!!");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.amount-=amount;
		return this.amount;
	}
	
	public synchronized void deposit(int amount)
	{
		
		System.out.println("Deposit process");
		this.amount+=amount;
		System.out.println("Updated Amount = "+this.amount);
		notify();
	}
	public static void main(String[] args) {
		 Customer c = new Customer();
		Thread t1 = new Thread()
				{
					public void run()
					{
						System.out.println(Thread.currentThread().getName());
						int bal  = c.withdraw(6000);
						System.out.println("Balance = "+bal);
					}
				};
				
				Thread t2 = new Thread()
				{
					
					public void run()
					{
						System.out.println(Thread.currentThread().getName());
						c.deposit(5000);
					}
				};
		t1.start();
		t2.start();		
	}	
}


/*
Inter-Thread Communication also Known as Co-operation.
wait()
notify()
notifyAll()

wait() and sleep() difference - synch.

*/

