package chapter01;

public class Q4 {

	public static void main(String[] args) {
		int x = new java.util.Random().nextInt(10);
		x++; //乱数を表示か乱数から1プラスを表示か
		if (x % 2 == 0) {
			System.out.println(x + "は偶数です");
		} else {
			System.out.println(x + "は奇数です");
		}

	}

}
