package enshu1_7;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * 人数を聞き、
		 * その人数分の点数を配列に読み込んで合計を求める。
		 * [実行例]
		 * 何人?>2
		 * 1人目の点数を入力してください>20
		 * 2人目の点数を入力してください>30
		 * 合計点数は50点です。
		 */
		System.out.println("何人?");
		int num = new java.util.Scanner(System.in).nextInt();
		int[] nums = new int[num];
		int sum = 0;
		for (int i = 0 ; i < nums.length ;i++){
			System.out.println((i + 1) + "人目の点数を入力してください");
			nums[i] = new java.util.Scanner(System.in).nextInt();
			sum += nums[i];
		}
		System.out.println("合計点は" + sum + "です");
	}

}
