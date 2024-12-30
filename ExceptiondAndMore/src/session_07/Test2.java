package session_07;

public class Test2 {
	
	public static void main(String[] args) //"10" "0"
	{
		try
		{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("c = "+c);
		}
		catch (Exception e) {
			if(e instanceof NumberFormatException)
			{
				System.out.println("Enter only integer data");
			}
			else if(e instanceof ArithmeticException)
			{
				System.out.println("Denominator should not be zero");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Atleast enter 2 parameters");
			}else
			{
			System.out.println("Exception!!!");
			}
		}
		System.out.println("Exit!!");
	}

}
