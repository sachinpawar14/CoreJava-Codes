package session_07;

import java.util.Scanner;

public class AssertDemo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = s.nextInt();
		
		assert age>18 : "Not Eligible for voting";
		
		System.out.println("You are Eligible for Voting "+age);
		
		
	}

}
