import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Demo2 extends Thread{
	static ArrayList a = new ArrayList();
	//static List a = Collections.synchronizedList(l);
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		a.add(20);
		System.out.println("------"+a);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		a.add(10);
		a.add(40);
		a.add(30);
		
		Demo2 t1 = new Demo2();
		t1.start();
		//l.add(50);
		//Thread.sleep(5000);
		
		Iterator itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//java.util.ConcurrentModificationException
		}
	}
	
	
	
}
