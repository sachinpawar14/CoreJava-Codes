package session_06;

public class Demo {
	
	public static void main(String[] args) {
		
		Shape s = new Circle(5);
		System.out.println("Area of Circle = "+s.area());
		
		Shape s1 = new Rectangle(5, 6);
		System.out.println("Area of Rectangle = "+s1.area());
		
	}

}
