package ensyu;
/*
 * 引数でintの値を3つ受け取ると、
 * その中の最大値を返却するメソッドを作成する。
 *
mainメソッドにて整数を３つ受け取り
、最大値を求める処理を作成せよ。

[実行例]
整数1を入れてください。>3
整数2を入れてください。>10
整数3を入れてください。>4
3つの整数値の最大は10です。
*/
public class Q04 {

	public static void main(String[] args) {
		System.out.println("整数1を入れてください。");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数2を入れてください。");
		int y = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数3を入れてください。");
		int z = new java.util.Scanner(System.in).nextInt();

		System.out.println("3つの最大値は" + max(x,y,z) +"です");
	}

	public static int max(int x,int y,int z){
		int result = x;
		if (result < y){
			result = y;
		}
		if(result < z){
			result = z;
		}
		return result;
	}

}
