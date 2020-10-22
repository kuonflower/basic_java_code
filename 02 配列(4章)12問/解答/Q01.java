package enshu1_7;

public class Q01 {
	public static void main(String[] args) {
		/*
		 * int型の配列を宣言する。
		 * 配列の要素数を3にする。
		 * 最初の要素に30を代入
		 * 次の要素に70を代入
		 * 最後の要素に10を代入
		 * 出力
		 *
		 * [実行例] nums[0]:30 nums[1]:70 nums[2]:10
		 */

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン１
		
		int[] nums;
		nums = new int[3];
		nums[0] = 30;
		nums[1] = 70;
		nums[2] = 10;

		System.out.println("nums[0]:"+ nums[0]+" nums[1]:"+ nums[1]+" nums[2]:"+ nums[2]);

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■


		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン２

		int[] nums;
		nums = new int[3];
		nums[0] = 30;
		nums[1] = 70;
		nums[2] = 10;
		for(int i = 0; i < nums.length; i++){
			System.out.print("nums[" + i + "]:" + nums[i] + " ");
		}

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	}
}
