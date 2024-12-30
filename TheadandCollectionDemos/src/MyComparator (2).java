
import java.util.Comparator;
public class MyComparator implements Comparator<Integer>{
	/*@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		if(i1>i2)
			return -1;
		else if(i1<i2)
			return +1;
		else
		return 0;
	}*/
	  @Override public int compare(Integer i1, Integer i2) 
	  { 
		  System.out.println(i1+" "+i2);
		  if(i1>i2)
				return -1;
			else if(i1<i2)
				return +1;
			else
			return 0;
	  }	 
}
