package shallowAndDeep;
public class Student implements Cloneable{	
	 int rollNo;
	 String name;
	 Course course;

	public Student(int rollNo, String name, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", "
				+ "course=" + course + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s=(Student)super.clone();
		s.course =(Course) course.clone();
		return s;
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










