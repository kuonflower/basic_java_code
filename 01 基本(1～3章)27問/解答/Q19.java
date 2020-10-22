package ensyu14_27;

public class Q19 {

	public static void main(String[] args) {
		/*
		 * ★をいくつ出力するかを聞き、
		 * その個数分★を出力する。
		 *
		 * [実行例] いくつ★を出力しますか？>5[enter] ★★★★★
		 */
		System.out.println("いくつ★を出力しますか？");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			System.out.print("★");
		}
	}
}
