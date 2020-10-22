package enshu8_12;

public class Q09 {

	public static void main(String[] args) {
		/*
		 * {3,8,10,5,4}という配列の要素を
		 * すべて２倍にする。
		 * 変更された配列を出力する。
		 *
		 * [実行例]
		 * 6
		 * 16
		 * 20
		 * 10
		 * 8
		 */
		int[] nums = { 3, 8, 10, 5, 4};

		for(int i = 0; i < nums.length ; i++){
			nums[i] = nums[i] * 2;
		}

		for(int value : nums){
			System.out.println(value);
		}

	}

}
