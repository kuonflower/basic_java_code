package chapter03;

public class Q09 {

	public static void main(String[] args) {
		System.out.println("一つ目の整数を入力してください");
		int num1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("二つ目の整数を入力してください");
		int num2 = new java.util.Scanner(System.in).nextInt();
		
		int ave = ave(num1, num2);
		 System.out.println("二つの整数値の平均は" + ave);
	

	}
	public static int ave(int num1, int num2) {
		return (num1 + num2) / 2;
	}

}
