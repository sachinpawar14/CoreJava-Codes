package session_10;

import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		Employee  e1 = new Employee(45, "Rahul");
		Employee  e2 = new Employee(32, "Aishwarya");
		Employee  e3 = new Employee(11, "Viraj");
		Employee  e4 = new Employee(89, "Sayalee");
		Employee  e5 = new Employee(5, "Kaushik");
		
		TreeSet<Employee> t = new TreeSet<Employee>(new MyComparator1());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
	}

}
