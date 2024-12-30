package session_06;
public class Student implements Cloneable{	
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


/*Cloning:
	Creating exact copy of an Object
	Class must implements Cloneable Interface (or
	will throw CloneNotSupportedException)
	Two Types:
		1. Shallow Copy(Cloning) -  Default Type of Cloning
		2.	Deep Cloning
*/










