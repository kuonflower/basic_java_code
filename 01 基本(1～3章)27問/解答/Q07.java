package ensyu;

public class Q07 {

	public static void main(String[] args) {
		/*----------------------------------------------------------------------------
		Q7
		スカイツリーの高さを入力させ、それがあっていれば「OK!」間違っていれば「NG」と表示する。

		[実行例]
		スカイツリーの高さは？(m)>634[enter]
		OK!
		----------------------------------------------------------------------------
		 * */
		System.out.println("スカイツリーの高さは？（m）");
		int sky = new java.util.Scanner(System.in).nextInt();
		if(sky == 634){
			System.out.println("OK!");
		}else{
			System.out.println("NG");
		}
	}

}
