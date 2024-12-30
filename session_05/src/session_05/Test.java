package session_05;

public class Test {
	public static void main(String[] args) {
		
		 Student s = new Student(222,"Rahul");
		System.out.println("Name = "+s.getName()+" RollNo = "+s.getRollNo());
		s.rollNo = 333;//CTE - Immutable class - final fields
	}
}
