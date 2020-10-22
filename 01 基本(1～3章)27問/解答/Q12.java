package ensyu;

public class Q12 {

	public static void main(String[] args) {
		/*----------------------------------------------------------------------------
		Q12
		スペイン語で日曜は何と言うかという３択問題を出題し、答えを番号で入力させる。
		正解だったら。「OK!」不正解だったら「NG」と出力する。
		（switch文を使用すること）

		[実行例]
		スペイン語で日曜は何?1:Lunes,2:Jueves,3:Domingo　>3[enter]
		OK!
		----------------------------------------------------------------------------
		 * */


		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン１

		System.out.println("スペイン語で日曜は何?1:Lunes,2:Jueves,3:Domingo");
		int num = new java.util.Random().nextInt();
		switch (num) {
		case 1:
			System.out.println("NG");
			break;
		case 2:
			System.out.println("NG");
			break;
		case 3:
			System.out.println("OK!");
			break;
		default:
			System.out.println("NG");
			break;
		}

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン２

		System.out.println("スペイン語で日曜は何?1:Lunes,2:Jueves,3:Domingo");

		int num = new java.util.Scanner(System.in).nextInt();
		switch(num){
		case 1:
		case 2:
			System.out.println("NG");
			break;
		case 3:
			System.out.println("OK!");
			break;
		default:
			System.out.println("NG");
			break;
		}
		
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		
	}

}
