public class Demo {
	public static void main(String[] args) {
		//Primitive to Wrapper
		int i = 100;
		Integer n = new Integer(i);//Boxing
		
		//Wrapper to Primitive
		int a = n.intValue();//Unboxing
		
		//String to primitive
		String str = "10";
		int b = Integer.parseInt(str);
		
		//String to Wrapper
		Integer c = Integer.valueOf(str);
		System.out.println(c);
		
		int no = 111;
		Integer d = no;//Auto-boxing
		no = d;//Auto-unboxing
	}

}
