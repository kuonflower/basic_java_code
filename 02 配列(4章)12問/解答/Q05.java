package enshu1_7;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * boolean型の配列を宣言すると同時に
		 * true,false,false,true,trueの値で初期化する。
		 * 「第何戦の結果を調べますか(1~5)>」
		 * ときく trueならば勝ち,そうでなければ負けと出力する。
		 *
		 * [実行例] 第何戦の結果を調べますか(1~5)>5
		 * 第5戦は[勝ち]です。
		 */
		boolean[] result = {true , false, false, true, true };
		System.out.println("第何戦の結果を調べますか(1~5)>");
		int a = new java.util.Scanner(System.in).nextInt();

		if(result[a-1] == true){
			System.out.println("第" + a + "戦は[勝ち]です。");
		}else{
			System.out.println("第" + a + "戦は[負け]です。");
		}

	}

}
