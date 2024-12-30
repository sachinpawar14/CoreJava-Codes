package session_02;
public class Employee {	
	private int empId;
	private String empName;
	private float empSal;
	private static int count;
	private static String companyName;

	public Employee() {}

	public Employee(int empId, String empName, float empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", "
				+ "empSal=" + empSal +",Company name ="+companyName+"]";
	}
	
	static
	{
		System.out.println("Static block1 called..");
		count = 63;	
	}
	
	static
	{
		System.out.println("Static block2 called..");
		companyName = "Infoway Technologies";
	}
	
	
	public static void main(String[] args) {
		System.out.println("In main method");
		System.out.println("Initial Count = "+Employee.getCount());//63
		Employee e1 = new Employee(111,"Rahul",564342.78f);
		Employee e2 = new Employee(222,"Sayalee",564342.78f);
		Employee e3 = new Employee(333,"Kaushal",564342.78f);
		//Classname.staticMethod();
		System.out.println("Count = "+Employee.getCount());//66
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	
	}
}
