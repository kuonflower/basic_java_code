package enshu8_12;

public class Q10 {

	public static void main(String[] args) {
		/*
		 * {3,8,10,5,4}という配列を逆順に並び替える。
		 * 変更された配列を出力する。
		 * [実行例]
		 * 4
		 * 5
		 * 10
		 * 8
		 * 3
		 */
		int[] nums = { 3, 8, 10, 5, 4,};
		for(int i = 0; i < nums.length / 2; i++){
			//入れ替え先インデックスをjに代入
			int j = nums.length -1 -i;
			int z = nums[i];
			nums[i] = nums[j];
			nums[j] = z;
		}

		for(int value: nums){
			System.out.println(value);
		}

	}

}
