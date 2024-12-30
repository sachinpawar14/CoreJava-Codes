package session_06;
public class Circle extends Shape {
	//private int radius;
	private final float PI = 3.14f;

	/*public Circle(int radius) {
		super();
		this.radius = radius;
	}*/
	
	public Circle(int radius) {
		super(radius);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI * radius * radius;
	}
}
