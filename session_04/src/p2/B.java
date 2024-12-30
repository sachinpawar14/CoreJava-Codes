package p2;
public class B extends A{
	private int b;
	
	public B()
	{b = 200;}

	@Override
	public void m1()//Over-ridden Method
	{
		System.out.println("In m1() of B");
	}
	
	public void m2()//specific method of class B
	{
		System.out.println("In m2() of B");
	}
	
	public static void main(String[] args) {
		/*
		 * B b = new B(); b.m1(); b.m2();
		 */
		A b = new B();//polyMorphic Reference
		((B) b).m2();//in order to call sub class specific method 
		// downcast the reference from super to sub
		 		
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
	}
}
