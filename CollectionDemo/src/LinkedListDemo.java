import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {
	public static void main(String[] args) {	
		LinkedList l = new LinkedList();
		//LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(78);
		l.add("Qwerty");
		l.add('A');
		l.add(78.65f);
		l.add('A');
		System.out.println(l);
		System.out.println(l.get(2));
		
		l.set(4, "java");
		System.out.println(l);
		
		l.remove(4);
		System.out.println(l);
		
		l.addFirst(100);
		System.out.println(l);
		
		l.addLast("java");
		System.out.println(l+"------------");
		
		l.add(1, "hello");
		System.out.println(l);
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
	
		//l.clear();
		//System.out.println(l);
		
		System.out.println("---------------");
		ListIterator itr = l.listIterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			if(o.equals(78))
				//itr.set("hii");
				itr.add("Hii!!!");	
		}
		/*
		 * while(itr.hasPrevious()) { Object o = itr.previous(); if(o.equals("hello"))
		 * //itr.set("hii"); itr.add("Hii!!!"); }
		 */
		System.out.println(l);
		
	}
}












