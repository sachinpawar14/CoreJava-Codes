package session_06;
public class Rectangle extends Shape {
	//private int len;
	//private int br;

	/*public Rectangle(int len, int br) {
		super();
		this.len = len;
		this.br = br;
	}*/
	
	public Rectangle(int len, int br) {
	super(len,br);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return len*br;
	}
}
