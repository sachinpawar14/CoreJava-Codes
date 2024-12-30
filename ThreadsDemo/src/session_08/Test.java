package session_08;

public class Test extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Current Thread = "
		+Thread.currentThread().getName());
		//main thread belongs to main group
		System.out.println("Group = "
		+Thread.currentThread().getThreadGroup().getName());
		System.out.println("Parent Group = "
		+Thread.currentThread().getThreadGroup().getParent().getName());
	}
	
}
