package session_06;

public class Test1 {

	public static void main(String[] args) {
		
		//Arithcal a = new Arithcal() ;
		AllCalculations a = new AllCalculations();
		System.out.println("Addition "+a.add(10, 20));
		System.out.println("Substraction = "+a.sub(55, 34));
		System.out.println("Minimum of two numbers = "+a.min(7, 4));
		System.out.println("Average = "+a.avg(7, 8));
		System.out.println("Factorial = "+a.factorial(6));
		System.out.println("no = "+Arithcal.no);
		//Arithcal.no = 1000;
	}
}


/*Type of Interface:
Tagged/marker Interface - Empty interface -Ex: Cloneable and Serializable Interface*/











