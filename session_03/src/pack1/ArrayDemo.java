package pack1;
public class ArrayDemo {
	public static void main(String... args) {	
		  int arr[] = new int[5]; 
		  arr[0] = 10; 
		  arr[1] = 20;
			
		/* int []arr = {1,2,3,4,5,6}; */
		
		/* int[] arr = new int[] {11,22,33,44,55}; */
		
		System.out.println("Array Elements are as follows: ");
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}
