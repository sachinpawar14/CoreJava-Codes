package session_05;
public class Employee extends Object{
	
	private int empId;
	private String empName;
	private float empSalary;
	
	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	@Override
	public boolean equals(Object o)//Object o = e2;
	{
		Employee e = (Employee)o;
		if((this.empId==e.empId)&&(this.empName.equals(e.empName) 
				&& (this.empSalary==e.empSalary)))
			return  true;
			else
		return false;
	}
	
	public int hashCode()
	{	
		return empId+1;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(111,"Rahul",11333.89f);
		Employee e2 = new Employee(111,"Sayalee",11333.89f);
		//Employee e2 = e1;
		
		/*
		 * if(e1 == e2) //will check equality of references
		 * System.out.println("Are equal"); 
		 * else
		 * System.out.println("Are not equal");
		 */

		  if(e1.equals(e2)) //will check equality of objects
		  {
			  System.out.println("Objects are equal");
		  }
			  else
			  {
			  System.out.println("Objects are not equal");
			  }
		  
		  System.out.println(e1.hashCode());
		  System.out.println(e2.hashCode());
	}
}
