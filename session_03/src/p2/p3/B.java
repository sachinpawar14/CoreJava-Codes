package p2.p3;

//import p1.A;
import p1.*;
import static p1.Student.*;
//import static p1.Student.fees;
//import static p1.Student.getFees;
import static java.lang.System.out;

public class B extends A {
//public class A extends p1.A{
	public static void main(String[] args) {
		//A a = new A();
		//p1.A a = new p1.A();//without inheritance
		B a = new B();
		out.println("no = " + a.no);
		a.getNo();
		out.println(fees);
		getFees();
	}
}
