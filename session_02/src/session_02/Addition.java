package session_02;
public class Addition {

	public int add(String str, int... a) {
		int sum = 0;
		System.out.println("Length = " + a.length);
		/*
		 * for(int i=0;i<a.length;i++) { sum+=a[i];//sum = sum + a[i]; }
		 */
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		int sum = a.add("abc", 10, 20);
		System.out.println("Sum = " + sum);
		System.out.println("Add = " + a.add("mno", 1, 2, 3, 4, 5, 6));
		System.out.println("Addition = " + a.add("pqr", 1, 2, 3));
	}
}

/*
 * Variable Arguments:
 * 
 * returnType methodName(dataType... varNm) 
 * { .... }
 * 
 * for-each loop: arrays/collection read-only
 * 
 * for(dataType varNm: arr/Collection)
 * {
 * stmts
 * }
 * 
 * 
 * 
 * 
 * 
 */
