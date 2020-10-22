package enshu1_7;

public class Q06 {

	public static void main(String[] args) {
		/*
		 * int型の配列を要素数5で用意する
		 * for文を利用し、0~100の乱数をそれぞれの要素に代入する
		 * for文を利用し、配列の内容を出力する
		 *
		 * [実行例] nums[0]:63 nums[1]:87 nums[2]:99 nums[3]:76 nums[4]:9
		 */
		int[] nums = new int[5];

		for(int i = 0; i < nums.length ; i++){
			nums[i] = new java.util.Random().nextInt(101);
		}

		for(int i = 0; i < nums.length ; i++){
			System.out.println("nums[" +  i + "]:" + nums[i]);
		}


	}

}
