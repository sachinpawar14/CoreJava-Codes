package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Demo {
	
	public static void main(String[] args) {
		
		Optional<Integer> number =
				Arrays.asList(1,2,3,4,5).stream().min(Integer::compareTo);
		int min = number.get();
		System.out.println("Min = "+min);
		
		List<Integer> l = Arrays.asList(1,2,3,4,5);
			l.forEach(x -> System.out.println(x));
			
		int n = IntStream.of(1,2,3,4,5).sum();
		System.out.println("n = "+n);
		
		int a = IntStream.rangeClosed(1, 5).sum();
		System.out.println("a = "+a);
		
		
		
	
	}

}
