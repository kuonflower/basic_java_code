package ensyu;

/*引数でintの値を受け取り、偶数か奇数か判断し
偶数の場合はtrueを奇数の場合はfalseを返却するメソッドを作成する。
mainメソッドで数値を一つ入力させ、偶数か奇数か求める処理を作成せよ。

[実行例]
整数を入れてください。>17
17は奇数です。*/
public class Q10 {

	public static void main(String[] args) {
		System.out.println("整数を入れてください。");
		int a = new java.util.Scanner(System.in).nextInt();
		judge(a);
		boolean result = judge(a);
		if(result){
			//偶数
			System.out.println(a + "は偶数です");
		}else{
			//奇数
			System.out.println(a + "は奇数です");
		}
	}

	public static boolean judge(int a) {
		boolean result;
		if (a % 2 == 0) {
			//偶数
			result = true;
		} else {
			//奇数
			result = false;
		}
		return result;
	}

}