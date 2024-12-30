package session_10;
import java.util.TreeSet;
public class TreeSetDemo {	
	public static void main(String[] args) {	
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		t.add(10);			
		//t.add("abc");//CTE
		t.add(98);
		t.add(10);
		t.add(67);
		t.add(3);
		//t.add(null);//NullPointerException	
		System.out.println(t);	
		//t.forEach(x ->{ System.out.println(x);});	
	}}


		
		
		
