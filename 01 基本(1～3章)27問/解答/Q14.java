package ensyu14_27;

public class Q14 {
	public static void main(String[] args) {
		/*
		 * サイコロを２個ふって、２個の合計を点数とする。 ただし、ゾロ目の場合は点数は２倍となる。 サイコロの目と点数を表示せよ。
		 *
		 * [実行例] dice1:3 dice2:3 score:12
		 */
		int dice1 = 0;
		int dice2 = 0;

		dice1 = new java.util.Random().nextInt(6) + 1;
		dice2 = new java.util.Random().nextInt(6) + 1;

		int score = dice1 + dice2;
		if (dice1 == dice2) {
			score *= 2;
		}
		System.out.println("dice1:" + dice1 + "dice2:" + dice2 + "score:" + score);
	}
}
