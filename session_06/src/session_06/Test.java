package session_06;

public class Test {
	
	public static void main(String[] args) {
		
		//Bank b = new Bank();//Abstract class cannot be instantiated
		Bank b = new IDBI();
		System.out.println("SBI ROI = "+b.getROI());
		
	}

}
