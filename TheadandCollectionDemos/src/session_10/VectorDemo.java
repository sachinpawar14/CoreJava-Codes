package session_10;
import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {	
	public static void main(String[] args) {	
		Vector<Integer> v = new Vector<Integer>();//10
		System.out.println(v.capacity());
		for(int i=1;i<=11;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		System.out.println(v.size());
		//System.out.println(v);
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			int i = e.nextElement();
			if(i%2 == 0)
				System.out.println(i);
		}
		System.out.println(v);		
	}
}
