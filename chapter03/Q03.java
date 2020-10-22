package chapter03;

public class Q03 {

	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println(x + "を3乗すると" + ans(x) + "です");

	}
	public static int ans (int x) {
		return x * x * x;
	}

}