package session_05;
import java.util.Scanner;
public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	protected Scanner s = new Scanner(System.in);
	
	/*
	 * public Person() 
	 * { 
	 * System.out.println("Enter FirstName = "); 
	 * firstName = s.next(); 
	 * System.out.println("Enter LastName = "); 
	 * lastName = s.next();
	 * System.out.println("Enter Age = "); 
	 * age = s.nextInt(); }
	 */
	
	/*
	 * public void getData() 
	 * { System.out.println("Enter FirstName = "); 
	 * firstName =s.next();
	 *  System.out.println("Enter LastName = "); 
	 *  lastName = s.next();
	 * System.out.println("Enter Age = "); 
	 * age = s.nextInt(); }
	 */
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	
	public void display()
	{
		System.out.println("Name = "+firstName+" "+lastName+" Age = "+age);
	}

	
	
	
	
	

}
