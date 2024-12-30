import java.util.ArrayList;
import java.util.Iterator;
public class Test {	
	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Rahul");
		Employee e2 = new Employee(2, "Rani");
		Employee e3 = new Employee(3, "Rajesh");
		Employee e4 = new Employee(4, "Raj");
		
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		
		Iterator<Employee> itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}	
	}
}



/*
 * 1. Create/add 2. Read 3. update 4. delete
 */






