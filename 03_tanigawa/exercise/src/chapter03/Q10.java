package chapter03;

public class Q10 {

	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		
		if (even(num)) {
			System.out.println(num + "は偶数です");
		} else {
			System.out.println(num + "は奇数です");
		}

	}
	
	public static boolean even(int num){
	return num % 2 == 0;
	}

}
