package shallowAndDeep;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Course c = new Course("Math", "History", "Geometry");
		Student s1 = new Student(111,"Rahul",c);

		Student s2 = null;
		
		s2 =(Student) s1.clone();
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1.course.c2 = "English";
		System.out.println(s2.course.c2);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
