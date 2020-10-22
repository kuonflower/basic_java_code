package ensyu;

public class Q04 {

	public static void main(String[] args) {
		/*----------------------------------------------------------------------------
		Q4
		1~10の乱数を生成して、それが偶数か奇数かを判定

		[実行例]
		8は偶数(even)
		----------------------------------------------------------------------------*/
		int i = new java.util.Random().nextInt(10);
		// 乱数で作った値0~9を1~10にした
		i++;

		// 数字だけ先に出力
		System.out.println(i);
		
		//iを2で割って余りが１の時
		if (i % 2 == 1) {
			System.out.println(i+"は奇数");
		} else {
			System.out.println(i+"は偶数");
		}

	}
}
