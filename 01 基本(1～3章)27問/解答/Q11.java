package ensyu;

public class Q11 {

	public static void main(String[] args) {
		/*----------------------------------------------------------------------------
		Q11
		英語の１０月を入力させ、正しければ「OK!」間違っていれば「NG」と出力する。
		（if~else文を使用すること）

		[実行例]
		10月は英語で何?>October[enter]
		OK!
		----------------------------------------------------------------------------
		 * */

		System.out.println("10月は英語で何？");
		String a = new java.util.Scanner(System.in).nextLine();
		if (a.equals("October")){
			System.out.println("OK!");
		}else{
			System.out.println("NG");
		}
	}

}
