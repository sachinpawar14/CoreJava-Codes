package session_04;
public class EnumDemo {
	
		public enum Seasons{SUMMER,WINTER,RAINY};
		
	public static void main(String[] args) {
		
		Seasons s = Seasons.RAINY;
		System.out.println(s);
		
		System.out.println("--------");
		for(Seasons s1:Seasons.values())
		{
			System.out.println(s1+" "+s1.ordinal());
		}
	}
}

/**
 * 	enum - type
 * 	Enum -Abstract class
 * 	Enumeration - interface
 */
