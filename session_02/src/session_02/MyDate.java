package session_02;
public class MyDate {
	private int dd,mm,yy;
	
	public MyDate()
	{
		//this(2,10,2024);
		System.out.println("Default");
		dd=mm=yy=1;
	}
	
	public MyDate(int dd,int mm,int yy)
	{
		//this();//constructor Chaining
		System.out.println("Parameterized");
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	
	

	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	public void get()
	{
		Demo d = new Demo();
		d.getMyDate(this);
	}
	
	public static void main(String[] args) {
		/*
		 * MyDate d = new MyDate(); System.out.println(d);
		 */
		 
		MyDate d = new MyDate(1,10,2024); 
		  System.out.println(d);

		d.get();
		
	}
}
