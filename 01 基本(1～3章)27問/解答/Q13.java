package ensyu;

public class Q13 {
	public static void main(String[] args) {
		/*
		 * ---------------------------------------------------------------------
		 * ------- Q13 日本の信号で渡っていい色を出題し、 漢字一文字で入力させる。 入力された文字が「青」
		 * または「緑」なら、「OK!」、 それ以外なら「NG」と出力する。 （switch文を使用すること） [実行例]
		 * 日本の信号で渡っていい色は(漢字一文字)>緑[enter] OK!
		 * ---------------------------------------------------------------------
		 * -------
		 */

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン１
		
		System.out.println("日本の信号で渡っていい色は？(漢字一文字)");
		String ans = new java.util.Scanner(System.in).nextLine();
		switch (ans) {
		case "緑":
			System.out.println("OK!");
			break;
		case "青":
			System.out.println("OK!");
			break;
		default:
			System.out.println("NG");
			break;

		}

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン２

		System.out.println("日本の信号で渡っていい色は(漢字一文字)");
		String a = new java.util.Scanner(System.in).nextLine();

		switch (a) {
		case "青":
		case "緑":
			System.out.println("OK!");
			break;
		default:
			System.out.println("NG");
		}

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		
	}
}
