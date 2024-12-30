package pack1;
public class Test {	
	public static void main(String[] args) {
		/*
		 * int arr[][] = new int[2][3];
		 *  arr[0][0] = 10; 
		 *  arr[0][1] = 20;
		 * 
		 * arr[1][0] = 30;
		 */
		
		//int [][]arr = new int[][] {{1,2,4},{5,6}};
		
		int[][] arr = {{1,2},{5,6,7},{8}};
		
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}
}




