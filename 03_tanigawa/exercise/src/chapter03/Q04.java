package chapter03;

public class Q04 {

	public static void main(String[] args) {
		System.out.println("一つ目の整数を入力してください");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("二つ目の整数を入力してください");
		int y = new java.util.Scanner(System.in).nextInt();
		System.out.println("三つ目の整数を入力してください");
		int z = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("三つの整数の値で一番大きいのは" + ans(x, y ,z) + "です");


	}
	public static int ans (int x, int y, int z) {
		int ans = 0;
		
		for(int i = 0; i < 3; i++) {
			if(x > y) {
				if(x > z) {
					ans = x;
				} else {
					ans = z;
				}
			} else if(y > z) {
				ans = y;
			} else {
				ans = z;
			}
		}
		return ans;
	}

}