package session_05;

public class Teacher extends Person{

	private String subject;
	
	/*
	 * public Teacher() 
	 * { super(); 
	 * System.out.println("Enter Subject = "); 
	 * subject = s.next(); }
	 */
	
	/*
	 * public void getData() { 
	 * super.getData();
	 * System.out.println("Enter Subject = ");
	 *  subject = s.next(); }
	 */
	
	public Teacher(String firstName, String lastName, int age, String subject) {
		super(firstName, lastName, age);
		this.subject = subject;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Subject = "+subject);
	}

	
	
}
