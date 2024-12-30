package session_10;

import java.util.HashMap;
import java.util.Map;
public class MapDemo {	
	public static void main(String[] args) {
		Map<Integer,String> m =new HashMap<Integer, String>();
		m.put(100, "mayuri");
		m.put(null, "rahul");
		m.put(80, "sayalee");
		System.out.println(m.put(100, "viraj"));
		System.out.println(m);
	}
}
