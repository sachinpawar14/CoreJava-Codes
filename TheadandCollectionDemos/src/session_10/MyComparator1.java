package session_10;

import java.util.Comparator;

public class MyComparator1 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		String s1 = o1.getEmpName();
		String s2 = o2.getEmpName();
		
		return -s1.compareTo(s2);
	}

}
