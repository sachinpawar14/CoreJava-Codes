package session_10;

public class Outer {
	
	private int no = 100;
	
	public class Inner
	{
		int no = 1000;
		public void get()
		{
			int  no = 10;
			System.out.println("no = "+no);
		}
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = o.new Inner();
		
		Inner i1 = new Outer().new Inner();
		
		i1.get();
		
	}

}
