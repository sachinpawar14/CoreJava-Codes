import java.lang.reflect.*;
//How to get Runtime information about class- Reflection
public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class cls = Class.forName("Employee");
		System.out.println(cls);
		
		Class superCls = cls.getSuperclass();
		System.out.println("SuperClass = "+superCls);
		
		System.out.println("Fields are : ");
		Field[] f = cls.getFields();
		for(Field i:f)
		{
			System.out.println(i);
		}
		
		System.out.println("Constructors are : ");
		Constructor[] c = cls.getConstructors();
		for(Constructor i:c)
		{
			System.out.println(i);
		}
		
		System.out.println("Methods are : ");
		Method[] m = cls.getMethods();
		for(Method i:m)
		{
			System.out.println(i);
		}
	}

}
