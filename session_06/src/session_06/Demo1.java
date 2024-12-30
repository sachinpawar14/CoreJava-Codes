package session_06;

public class Demo1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student(111,"Rahul");
		Student s2 = null;
		s2 =(Student)s1.clone();
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
