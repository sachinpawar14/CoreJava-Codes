package session_05;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		/*
		 * System.out.println("Enter id = "); 
		 * int id = s.nextInt(); 
		 * s.nextLine();
		 * System.out.println("Enter Firstname = "); 
		 * String fname = s.nextLine();
		 * System.out.println("Enter Lastname = "); 
		 * String lname = s.nextLine();
		 * System.out.println("Enter percentage = ");
		 *  float percent = s.nextFloat();
		 * 
		 * System.out.println(id+" "+fname+" "+lname+" "+percent);
		 */
		System.out.println("Enter Fullname = ");
		String str = s.nextLine();
		System.out.println("Fullname = "+str);
		
	}

}
