package chapter03;

public class Q08 {

	public static void main(String[] args) {
		System.out.println("価格を入力してください");
		int price = new java.util.Scanner(System.in).nextInt();
		int ans = tax(price);
		System.out.println(price + "円は消費税込み" + ans + "です");

	}
	public static int tax(int price){
		int ans = (int)(price * 1.1);
		return ans;
	}

}
