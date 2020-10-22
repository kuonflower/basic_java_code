package ensyu;

public class Q09 {

	public static void main(String[] args) {
		/*----------------------------------------------------------------------------
		Q9
		0~9の乱数を5つ生成し、それの合計(sum)と平均(avg)を求める

		[実行例]
		5個の数値の合計は24平均は4.8
		----------------------------------------------------------------------------*/

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//              パターン１
		int num1 = new java.util.Random().nextInt(10);
		int num2 = new java.util.Random().nextInt(10);
		int num3 = new java.util.Random().nextInt(10);
		int num4 = new java.util.Random().nextInt(10);
		int num5 = new java.util.Random().nextInt(10);

		int sum = num1 + num2 + num3 + num4 + num5;
		int avg = sum / 5 ;

		System.out.println("5つの数値の合計は"+sum+"平均は"+avg);
	    //■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//              パターン２
		
		// 合計用の変数を初期化
		int sum = 0;
		//繰り返す数の変数
		int cnt = 5;
		for (int i = 0; i < cnt; i++) {
			//乱数を作り合計用の箱sumに足しこむ
			sum += new java.util.Random().nextInt(10);
		}
		double avg = (double)sum /cnt;
		System.out.println(cnt +"個の数値の合計は" + sum + "平均は" + avg);

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	}

}
