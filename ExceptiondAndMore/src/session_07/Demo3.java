package session_07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo3 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s = null;
		try(FileInputStream fis = new FileInputStream("abc.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);)
		{
		s =(Student) ois.readObject();
		System.out.println(s);
		}
		
	}

}
