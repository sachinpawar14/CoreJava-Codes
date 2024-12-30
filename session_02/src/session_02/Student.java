package session_02;
public class Student {

	private int rollNo;
	private String name;
	private float marks;

	public Student() {
		System.out.println("Default Constructor is Invoked");
		rollNo = 1;
		name = "Rahul";
		marks = 78.89f;
	}

	public Student(int r, String n, float m) {
		System.out.println("Parameterized Constructor Called");
		rollNo = r;
		name = n;
		marks = m;
	}

	public String toString() {
		return "Student = " + rollNo + " " + name + " " + marks;
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		Student s1 = new Student(2, "Sayalee", 89.56f);
		System.out.println(s1);
	}
}
