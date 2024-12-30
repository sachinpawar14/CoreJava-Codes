package pack1;
public class Demo {
	public static void main(String[] args) //"10000" "5" "2.5"
	{
		if(args.length == 3)
		{
			long p = Long.parseLong(args[0]);
			int n = Integer.parseInt(args[1]);
			float r = Float.parseFloat(args[2]);
			
			double  si = p*n*r / 100;
			System.out.println("Simple Interest = "+si);
		}
		else
		{
			System.out.println("Insufficient Arguments...");
		}
	}
}
