package session_07;
public class Test1 {	
	public static void main(String[] args) //"10" "0"
	{
		try
		{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("c = "+c);
		}catch (ArithmeticException e) {
			//System.out.println(e);
			System.out.println("Denominator should not be zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			 //e.printStackTrace();
			System.out.println("Atleast enter 2 parameters");
		}
		catch (NumberFormatException e) {
			//System.out.println(e.getMessage());
			System.out.println("Enter only integer data");
		}catch (Exception e) {
			System.out.println("Exception!!!");
		}
		System.out.println("Done!!");
	}

}
