package session_05;

public class B extends A{
	
	B get()
	{
		return new B();
	}
	
	public void msg()
	{
		System.out.println("Hello!!!");
	}
	
	public static void main(String[] args) {
		
		new B().get().msg();
		
	}

}
