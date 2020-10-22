package ensyu;

public class Qextra {
	public static void main(String[] args) {

		/*
		 * 引数でintの値を受け取り、受けっとった数字の数だけ階段を出力する プログラムを作成する。
		 * mainメソッドで数値を一つ入力させ、階段を出力する処理を作成せよ。
		 *
		 * [実行例] 整数を入れてください。>5
		 *      ■
		 *     ■■
		 *    ■■■
		 *   ■■■■
		 *  ■■■■■
		 *  －－－－－－－－－－－－－－－－－－－－－－
		 */
		System.out.println("整数を入れてください。");
		int input = new java.util.Scanner(System.in).nextInt();
		printPyramid(input);

		/*
		 * 引数でint[]を受け取り、受け取った配列のクローンを返却するメソッドを作成する。
		 *
		 * mainメソッドで、次の配列int[] aryPoint = new int[]{10,20,30};を作成し、int[]
		 * aryでうけとる処理を作成せよ。
		 */
		int[] aryPoint = new int[]{10,20,30};

		int[] ary = cloneArray(aryPoint);

		/*
		 * －－－－－－－－－－－－－－－－－－－－－－ 以下の配列 int[][] arrがある。
		 * int型の2次元配列の内容を表示するメソッドprintArrayを プログラミングせよ
		 *
		 * int[][] arr = new int[][] { { 3, 6, 9, 1 }, { 7, 5, 4 }, { 7, 4 }, {
		 * 0, }, }; printArray(arr);
		 *
		 * [実行例]
		 * {
		 * 	{3, 6, 9, 1, },
		 * 	{7, 5, 4, },
		 * 	{7, 4, },
		 * 	{0, },
		 * }/
		 */
		int[][] arr = new int[][] {
			{ 3, 6, 9, 1 },
			{ 7, 5, 4 },
			{ 7, 4 },
			{ 0, },
		};

		printArray(arr);

	}

	public static void printPyramid(int num){
		 for (int i = 0; i <= num; i++) {
             for (int j = 0; j <= (num - i); j++) {
                 System.out.print(" ");
             }
             for (int k = 0; k < i; k++) {
                 System.out.print("■");
             }
             //windowsエディタでの改行コード println()を使用しても可
             System.out.print("\n");
         }
	}

	public static int[] cloneArray(int[] arr) {
		int[] retArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			retArr[i] = arr[i];
		}
		return retArr;
	}

	public static void printArray(int[][] arr) {
		System.out.println("{");
		for (int i = 0; i < arr.length; i++) {
			//windowsエディタ上でのタブコード
			//半角スペース複数で実装していても可
			System.out.print("\t{");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ",\t");
			}
			System.out.println("},");
		}
		System.out.println("}");
	}
}
