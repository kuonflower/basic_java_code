package ensyu;

public class Q08 {

	public static void main(String[] args) {
		/*----------------------------------------------------------------------------
		Q8
		0~100の乱数を一つ生成し、それが80以上なら「Excellent！」,50以上なら「Good」,
		それ以外は「Bad」と表示する

		[実行例]
		Score:24
		Bad
		----------------------------------------------------------------------------*/
		int r = new java.util.Random().nextInt(101);
		System.out.println("Score:" + r);
		if (r >= 80) {
			System.out.println("Excellent!!");
		} else if (r >= 50) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}

}
