package session_10;
public class Employee  implements Comparable<Employee>{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	  @Override 
	  public int compareTo(Employee o)
	  {
		  int i1 = this.empId;
		  int i2 = o.empId;
		  
		  if(i1<i2)
				return -1;
			else if(i1>i2)
				return +1;
			else
			return 0;

	  }

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}
	  
	  
}
