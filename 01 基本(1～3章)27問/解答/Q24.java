package ensyu14_27;

public class Q24 {

	public static void main(String[] args) {
		/*
		 * 二つの数値を入力させ、その2値の入れ替えを行え。
		 *
		 * [実行例] xに代入する数値をいれてください。>5[enter] yに代入する数値をいれてください。>3[enter]
		 * ２つの数値を入れ替えました。x:3,y:5
		 */
		int z = 0;
		System.out.println("xに代入する数値をいれてください。");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println(" yに代入する数値をいれてください。");
		int y = new java.util.Scanner(System.in).nextInt();

		System.out.println("２つの数値を入れ替えました。");
		z = x;
		x = y;
		y = z;
		System.out.println("x:" + x + "y:" + y);
	}

}
