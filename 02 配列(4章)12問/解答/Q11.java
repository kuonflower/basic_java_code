package enshu8_12;

public class Q11 {

	public static void main(String[] args) {
		/*
		 * {3,8,10,5,4}という配列を昇順に並び替える。
		 * 変更された配列を出力する。
		 * [実行例]
		 * 3
		 * 4
		 * 5
		 * 8
		 * 10
		 */
		int[] nums = {3, 8, 10, 5, 4,};
		for(int i = 0; i < nums.length ; i++){
			for (int j = i + 1; j< nums.length ; j++){
				if(nums[i] > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}

		for(int i = 0; i < nums.length ; i++ ){
			System.out.println(nums[i]);
		}
	}
}
