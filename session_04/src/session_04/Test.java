package session_04;
import java.util.Scanner;
public class Test {	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int size = scanner.nextInt();
		Student[] s = new Student[size];
		
		System.out.println("Enter Students Details-->");
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter Student RollNo = ");
			int rn = scanner.nextInt();
			System.out.println("Enter Student firstName = ");
			String fnm = scanner.next();
			System.out.println("Enter Student lastName = ");
			String lnm = scanner.next();
			System.out.println("Enter Student percenatge = ");
			float percent = scanner.nextFloat();
			
			s[i] = new Student(rn,fnm,lnm,percent);
		}
		
		System.out.println("Students are as follows: ");
		for(int i=0;i<s.length;i++)
		{
			//System.out.println(s[i]);
			System.out.println(s[i].getRollNo()+" "+s[i].getFirstName()+
					" "+s[i].getLastName()+" "+s[i].getPercentage());
		}
		scanner.close();
	}
}
