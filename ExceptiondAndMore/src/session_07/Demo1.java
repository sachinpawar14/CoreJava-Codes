package session_07;
import java.io.*;
public class Demo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello");
		int i = System.in.read();
		System.out.println("i = "+i);
		System.err.println("Error!!!");
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try
		{
		//FileOutputStream fos = new FileOutputStream("d://abc.txt");
		/*fos = new FileOutputStream("abc.txt",true);
		String str = "90";
		byte[] b = str.getBytes();
		//fos.write(90);
		fos.write(b);*/
			int x=0;
		fis = new FileInputStream("abc.txt");	
		while((x = fis.read())!= -1)
		{
			System.out.println((char)x);
		}
			
		System.out.println("Success");
		}catch (Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("Finally Called...");
			//fos.close();
			fis.close();	
		}
	}
}


