package ensyu;

/*
 * 引数でintの値を受け取る
 * それを３乗した値を返すメソッドを作成する。
	mainメソッドで数値を一つ入力させ、
	実行例のようになるようにせよ。

[実行例]
整数を入れてください。>17
17を３乗すると4913です。
*/
public class Q03 {

	public static void main(String[] args) {
		System.out.println("整数を入れてください。");
		int num = new java.util.Scanner(System.in).nextInt();
		int result = calc(num);
		System.out.println(num + "を3乗すると" + result + "です");
	}

	public static int calc(int num){
		int result = num * num * num;
		return result;
	}

}
