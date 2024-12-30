package pack1;

//public final class A {
	public  class A {
	
	private final float PI;
	
	public A()
	{
		PI = 3.14f;
	}
	
	/*
	 * public final void get() { //PI = 45.89f; }
	 */
	
	public static void main(String[] args) {
		
		final A a = new A();
		a = new A();
	}
}







