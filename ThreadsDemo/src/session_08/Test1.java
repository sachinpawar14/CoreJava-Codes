package session_08;

public class Test1 {
	public static void main(String[] args) {	
		ThreadGroup pg = new ThreadGroup("Parent Group");
		System.out.println(pg.getName());
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		System.out.println(cg.getName());
		
		System.out.println(pg.getParent().getName());	
	}
}
/*
System
main
Parent Group
Child group
*/
