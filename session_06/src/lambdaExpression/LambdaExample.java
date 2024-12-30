package lambdaExpression;
public class LambdaExample {	
	public static void main(String[] args) {	
		//HelloWorldInterface h = () -> "Hello Java!!!";
		/*
		 * HelloWorldInterface h = () ->{ return "Hello Java!!!"; };
		 */
		//HelloWorldInterface h = (x) -> x.toUpperCase();
		//HelloWorldInterface h = (x) -> x.length();
		
		//System.out.println(h.sayHello("rahul"));
		//System.out.println(h.sayHello("sayalee"));
		
		/*HelloWorldInterface h = (x) -> 
		{
			return x+10;
		};
		System.out.println(h.add(20));*/
	
	/*	HelloWorldInterface h = (x,y) -> {return x.concat(y);};
		System.out.println(h.strConcat("Rahul", " Pawar"));*/
		
		HelloWorldInterface h = (x,y) -> {System.out.println(x.concat(y));};
		h.strConcat("Rahul", " Patil");
		
		h.sayHello("Java");
		
		System.out.println(HelloWorldInterface.get(10));
	}

}
