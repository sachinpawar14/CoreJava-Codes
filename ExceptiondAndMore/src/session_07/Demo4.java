package session_07;

import java.text.DecimalFormat;

public class Demo4 {
	public static void main(String[] args) {	
		double d = 12.8934903;
		//System.out.println(String.format("%.2f", d));
		
		DecimalFormat d1 = new DecimalFormat("0.00");
		String str = d1.format(d);
		System.out.println("str = "+str);
	}

}

	//%.2f
