public class Employee {
	private int empId;// instance variables
	private String empName;
	private float empSalary;

	public void initEmployee() {
		empId = 111;
		empName = "Rahul";
		empSalary = 120000.89f;
	}

	public void displayEmployee() {
		System.out.println("Employee = " + empId + " " + empName + " " + empSalary);
	}

	public static void main(String args[]) {
		// Employee e;//reference var
		// e = new Employee();
		Employee e = new Employee();
		System.out.println(e.empId + " " + e.empName + " " + e.empSalary);
		e.initEmployee();
		e.displayEmployee();

	}
}
