package session_08;

public class Test3 {
	
	public static void main(String[] args) {
		
		Runnable r = () -> {
			int sum= 0 ;
			for(int i=1;i<=10;i++) 
			{
				sum+=i;
			} 
			System.out.println("sum = "+sum);
			};
		new Thread(r).start();
	}

}
