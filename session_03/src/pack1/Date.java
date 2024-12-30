package pack1;

public class Date {
	
	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public static void swapDates(Date d1, Date d2)
	{
		System.out.println("In swap dates--->");
		Date temp;
		temp = d1;
		d1 = d2;
		d2 = temp;
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);	
	}

	public String toString() {	return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";}
	
	public static void main(String[] args) {
		Date d1 = new Date(3,10,2024);
		Date d2 = new Date(4,11,2025);
		System.out.println("Before swapping---->");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		Date.swapDates(d1, d2);
		System.out.println("After swapping---->");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);	
	}
}
