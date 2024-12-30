package session_10;

import java.util.Hashtable;

public class Demo {
	public static void main(String[] args) {
		Hashtable<Temp, String> t = new Hashtable<Temp, String>();//11
		//Hashtable<Temp, String> t = new Hashtable<Temp, String>(16);
		t.put(new Temp(10), "A");
		t.put(new Temp(5), "B");
		t.put(new Temp(23), "C");
		t.put(new Temp(13), "D");
		t.put(new Temp(1), "E");
		t.put(new Temp(7), "F");
		t.put(new Temp(7), "F");
		//t.put(null, "F");
		
		System.out.println(t);
		
		
	}

}
