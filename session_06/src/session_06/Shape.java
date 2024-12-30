package session_06;
public abstract class Shape {
	 int radius;
	 int len;
	 int br;

	public Shape(int radius) {
		//super();
		this.radius = radius;
	}

	public Shape(int len, int br) {
		//super();
		this.len = len;
		this.br = br;
	}

	public abstract double area();//abstract method- no body
}
