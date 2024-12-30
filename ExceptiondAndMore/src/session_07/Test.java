package session_07;

public class Test {
	
	public static void main(String[] args) //"10" "0"
	{
		try
		{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("c = "+c);
		}catch (Exception e) {
			System.out.println("Exception Occurred!!!");
		}
	}

}
