package session_04;
public class Date {	
	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public static void swapDates(Date d[])
	{
		System.out.println("In swap dates--->");
		Date temp;
		temp = d[0];
		d[0] = d[1];
		d[1] = temp;	
	}
	public String toString() {	return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";}
	public static void main(String[] args) {
		Date[] d = new Date[2];
		Date d1 = new Date(3,10,2024);
		Date d2 = new Date(4,11,2025);
		d[0] = d1;
		d[1] = d2;
		System.out.println("Before swapping---->");
		System.out.println("d1 = "+d[0]);
		System.out.println("d2 = "+d[1]);
		Date.swapDates(d);
		System.out.println("After swapping---->");
		System.out.println("d1 = "+d[0]);
		System.out.println("d2 = "+d[1]);	
	}
}
