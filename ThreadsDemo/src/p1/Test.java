package p1;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		Account a = new Account();//only one object
		MyThread1 t1 = new MyThread1(a);
		MyThread2 t2 = new MyThread2(a);
		t1.start();
		t2.start();
		Thread.sleep(1500);
		System.out.println("Updated Balance = "+a.getBalance());
	}

}
