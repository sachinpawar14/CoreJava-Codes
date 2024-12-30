package session_07;
public class Demo {
	public static void getMsg()
	{
		msg();
	}
	
	public static void msg()
	{
		int a = 10/0;
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		Demo.getMsg();	
	}
}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at session_07.Demo.msg(Demo.java:12)
at session_07.Demo.getMsg(Demo.java:7)
at session_07.Demo.main(Demo.java:18)*/