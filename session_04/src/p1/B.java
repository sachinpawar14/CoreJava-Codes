package p1;

public class B extends A{
	
	private int b;
	
	public B()
	{
		b = 200;
	}

	public static void main(String[] args) {
		
		B b = new B();
		//System.out.println(b.no);CTE
		System.out.println(b.b);
		b.getNo();
	}
	
}
