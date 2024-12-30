package lambdaExpression;

@FunctionalInterface
public interface HelloWorldInterface {
	
	//public String sayHello();
	
	//public String sayHello(String str);
	
	//public int sayHello(String str);
	
	//public int add(int str);
	
	//public String strConcat(String str1,String str2);
	
	public void strConcat(String str1,String str2);
	
	public default void sayHello(String str)
	{
		System.out.println(str);
	}
	
	public static String get(int no)
	{
		return no+"";
	}

}
