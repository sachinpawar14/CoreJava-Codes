package p1;

public class D extends C{
	
	public D()
	{
		//super();
		System.out.println("In default constructor of D");
	}
	
	public D(int a)
	{
		//super();
		super(100);
		System.out.println("In parameterized Constructor of D");
	}

	public static void main(String[] args) {
		D d = new D(10);
	}
}
