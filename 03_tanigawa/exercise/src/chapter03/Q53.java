package chapter03;

public class Q53 {

	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{ 3, 6, 9, 1 },
			{ 7, 5, 4 },
			{ 7, 4 },
			{ 0, },
		};
		
		printArray(arr);

	}
	
	public static void printArray(int[][] arr) {
		System.out.println("{");
		for(int i = 0; i < arr.length; i++) {
			System.out.print("      {");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ",     ");
				
			}
			System.out.println("}");
		}
		System.out.println("}");
	}

}
