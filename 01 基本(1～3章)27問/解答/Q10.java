package ensyu;

public class Q10 {

	public static void main(String[] args) {
		/*----------------------------------------------------------------------------
		Q10
		0~100の乱数を１０個生成し、５０以上の値の個数を求める。

		[実行例]
		50以上のscoreは6個ありました。

		----------------------------------------------------------------------------*/
		int a = 0;
		for (int i = 0; i < 10; i++) {
			int num = new java.util.Random().nextInt(101);
			if (num >= 50) {
				a += 1;
			}
		}

		System.out.println("50以上のスコアは" + a + "個ありました");

	}

}
