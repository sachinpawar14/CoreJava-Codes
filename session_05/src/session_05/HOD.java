package session_05;

public class HOD extends Teacher{

	private String branch;
	
	/*
	 * public HOD() { 
	 * super(); 
	 * System.out.println("Enter Branch = "); 
	 * branch = s.next(); }
	 */
	
	/*
	 * public void getData() { 
	 * super.getData();
	 * System.out.println("Enter Branch = "); 
	 * branch = s.next(); }
	 */
	
	public HOD(String firstName, String lastName, int age, 
			String subject, String branch) {
		super(firstName, lastName, age, subject);
		this.branch = branch;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Branch = "+branch);
	}
}
