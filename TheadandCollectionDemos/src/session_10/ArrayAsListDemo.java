package session_10;

import java.util.Arrays;
import java.util.List;
public class ArrayAsListDemo {
public static void main(String[] args) {
		String s[] = {"A","Z","K","c"};
		List l = Arrays.asList(s);//viewing array as list
		System.out.println(l);
		s[0] = "B";
		System.out.println(l);
		l.set(1, "L");
		System.out.println(l);
		/*
		 * for(String s1:s) { System.out.println(s1); }
		 */
		//l.add("M");//UnsupportedOperationException
		//System.out.println(l);
		//l.remove(2);////UnsupportedOperationException
		//System.out.println(l);
		l.set(1,new Integer(10));//java.lang.ArrayStoreException: 
								//java.lang.Integer
		//System.out.println(l);
	}
}
