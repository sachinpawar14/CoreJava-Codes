package session_07;

import java.io.*;

public class Demo2 {
	
	public static void main(String[] args) throws IOException {
		Student s = new Student(111, "Rahul");
		try(FileOutputStream fos = new FileOutputStream("abc.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);)
		{
		oos.writeObject(s);
		}
	}

}
