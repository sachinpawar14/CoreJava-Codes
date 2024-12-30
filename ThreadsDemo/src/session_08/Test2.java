package session_08;
public class Test2 {
	public static void main(String[] args) {
		
		ThreadGroup tg = new ThreadGroup("Parent");
		ThreadGroup cg = new ThreadGroup(tg, "Child");
		Thread t1 = new Thread(tg, "one");
		Thread t2 = new Thread(tg,"two");
		//t1.start();
		//t2.start();
		//tg.list();
		System.out.println("Parent Priority = "+tg.getMaxPriority());
		tg.setMaxPriority(3);
		Thread t3 = new Thread(tg,"three");
		t1.start();
		t2.start();
		t3.start();
		tg.list();
	}

}
