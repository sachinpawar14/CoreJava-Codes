package session_05;

public class A extends Object{
	
	A get()
	{
		return this;
	}

	public static void main(String[] args) {
		
		Object obj = new A();
		System.out.println(obj.hashCode());
	}
}

/*
 * Object
 * 
 * A
 * 
 * B
 */