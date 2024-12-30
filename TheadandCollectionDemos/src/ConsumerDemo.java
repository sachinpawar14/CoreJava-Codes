import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer<String> c = (x) -> 
		{System.out.println("Length = "+x.length()+" The value of x = "+x);};
				c.accept("rahul");
				
		Consumer<Integer> c1 = (a)->
		{System.out.println("a/a = "+(a/a));System.out.println("a*a = "+(a*a));};
		c1.accept(10);		
	}

}
