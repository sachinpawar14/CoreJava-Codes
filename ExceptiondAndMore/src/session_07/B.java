package session_07;

public class B {
	
	public static void main(String[] args) {
		A a = new A();	
		double d = a.div(5, 2);
		
			try
			{
			if(d<1)
				throw new MyException();
		}catch (MyException e) {
			System.out.println(e);
		}
		System.out.println("d = "+d);
	}

}
