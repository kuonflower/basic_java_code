package ensyu14_27;

public class Q26 {

	public static void main(String[] args) {
		/*
		 * 実行例のような３行３列の描画をせよ。
		 * [実行例]
		 * ★★★
		 * ★★★
		 * ★★★
		 */

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン１

		for(int i = 1 ; i < 10 ; i++){
			System.out.print("★");
			if(i % 3 == 0){
				System.out.println();
			}
		}

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン２
		
		for(int i = 0;i < 3; i++){
			for(int j = 0;j < 3; j++){
				System.out.print("★");
			}
			System.out.println("");
		}

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	}
}
