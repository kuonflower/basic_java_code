package chapter04;

public class Calculation {
	//Q1
	public static int tasu(int x, int y) {
		return x + y;
		
	}
	//Q2
	public static int hiku(int x, int y) {
		return x - y;
	}
	//Q3
	public static boolean evenNumberJudge(int x) {
		
		return x % 2 == 0;
	}
	//Q4
	public static boolean findNumber(int z) {
		int count = 0;
		int num = 0;
		for(int i = 0; i < 100; i++){
			count++;
			num = new java.util.Random().nextInt(100) + 1;
			if(z == num){
				System.out.println(count + "回目に" + z + "を発見！ループを止めます");
				break;
			}
			
		}
		return z == num;
	}
	//Q5
	public static int[] arrayGeneration(int x) {
		int array[] = new int[x];
		for(int i = 0; i < x; i++) {
			array[i] = new java.util.Random().nextInt(100) + 1;
		}
		
		return array;
	}

}
