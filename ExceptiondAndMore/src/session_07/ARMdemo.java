package session_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ARMdemo {
	
	public static void main(String[] args) throws IOException {
	
		try(FileInputStream fis = new FileInputStream("abc.txt");
				FileOutputStream fos = new FileOutputStream("mno.txt"))
		{
			//mno.txt -  Java is an object oriented programming
			//count of 'o' in mno.txt
			//abc.txt = count is 3
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
