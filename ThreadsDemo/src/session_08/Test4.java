package session_08;

public class Test4 {
	
	public static void main(String[] args) {
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		System.out.println(system);
		System.out.println("Active Thread count = "+system.activeCount());
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread a:t)
		{
			System.out.println(a.getName()+" "+a.isDaemon());
		}
	}

}
