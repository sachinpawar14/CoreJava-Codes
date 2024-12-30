import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Demo1 {
public static void main(String[] args) {	
		List<String> l = new ArrayList<String>();	
		l.add("abc");
		l.add("10");
		//l.add(null);
		l.add("abc");
		l.add("rtf");
		l.add("pqr");
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			if(s.equals("10"))
				itr.remove();
			else
				System.out.println(s);
		}
		
		System.out.println(l);
		
	}

}
