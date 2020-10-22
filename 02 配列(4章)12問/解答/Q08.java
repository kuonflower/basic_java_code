package enshu8_12;

public class Q08 {

	public static void main(String[] args) {
		/*
		 * {3,8,10,5,4}という配列に入っている奇数を
		 * すべて表示する
		 *
		 * [実行例]
		 * 3
		 * 5
		 */
		int[] score = { 3, 8, 10, 5, 4, };
		for(int i = 0; i < score.length; i++){
			if (score[i]%2 == 1 ){
				System.out.println(score[i]);
			}
		}

	}
}
