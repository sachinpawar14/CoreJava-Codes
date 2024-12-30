package p1;
public class Account {	
	private int balance;
	
	public Account()
	{
		balance = 10000;
	}
	
	public synchronized void deposit(int amount) throws InterruptedException
	{
		System.out.println("Start = "+Thread.currentThread().getName());
		int temp;
		temp = balance;
		temp+=amount;
		Thread.sleep(500);
		balance = temp;
		System.out.println(Thread.currentThread().getName()+"Bal = "+balance);
	}
	
	public int getBalance()
	{
		return balance;
	}
}
