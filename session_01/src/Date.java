import java.util.Scanner;

public class Date {

	private int day, month, year;

	public void setDay(int d) {
		day = d;
	}

	public int getDay() {
		return day;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Date d = new Date();
		System.out.println("Enter Day = ");
		int day = s.nextInt();
		d.setDay(day);
	System.out.println("Day = "+d.getDay());
	//read a character
	System.out.println("Enter a character = ");
	char ch = s.next().charAt(0);
	System.out.println("Ch = "+ch);

	}
}
