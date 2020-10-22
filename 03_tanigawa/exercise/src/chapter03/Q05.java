package chapter03;

public class Q05 {

	public static void main(String[] args) {
		System.out.println("1からいくつまで足しますか？");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println(ans(x));

	}
	public static int ans(int x) {
		int ans = 0;
		for(int i = 0; i < x; i++) {
			ans += (i + 1);
		}
		return ans;
	}

}
