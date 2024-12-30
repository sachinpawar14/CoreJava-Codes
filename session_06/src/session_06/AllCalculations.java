package session_06;
public class AllCalculations extends CalNumber implements StaticCal,CompareCal{

	@Override
	public int add(int a, int b) {
		return (a+b);
	}

	@Override
	public int sub(int a, int b) {
		return (a-b);
	}

	@Override
	public int min(int a, int b) {
		int min = (a<b)?a:b;
		return min;
	}

	@Override
	public int avg(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b)/2;
	}
}
