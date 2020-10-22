package enshu1_7;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * 次の手順で配列を生成し、出力せよ。
		 *
		 * char型の配列を宣言すると同時に
		 * ’H’,’E’,’L’,’L’,’O’,’!’
		 * の値で初期化する。
		 * for文で回しながら出力する
		 *
		 * [実行例] HELLO!
		 */
		char[] moji = {'H','E','L','L','O','!'};
		for(int i = 0; i < moji.length ; i++){
			System.out.print(moji[i]);
		}
	}

}
