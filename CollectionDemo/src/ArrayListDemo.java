import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {	
		List l = new ArrayList();	
		l.add(10);
		System.out.println(l.add('A'));
		l.add(null);
		l.add(10);
		l.add("abc");
		l.remove(2);
		
		System.out.println(l);
		//String s = (String)l.get(2);
		//System.out.println(l.get(3));
		
		for(Object a : l)
		{
			//String s = (String)a;//ClassCastException
			System.out.println(a);
		}
	}

}
