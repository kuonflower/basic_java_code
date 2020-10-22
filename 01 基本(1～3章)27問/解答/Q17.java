package ensyu14_27;

public class Q17 {

	public static void main(String[] args) {
		/*
		 * 10からカウントダウンし、０になったらStart!!
		 * と表示する。
		 *
		 * [実行例] 10 9 8 7 6 5 4 3 2 1 Start!!
		 */

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン１
		
		int countDown= 10;

		while(countDown != 0){
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("Start!!");
		
		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン２

		for(int i = 10; i >0 ; i--){
			System.out.println(i);
		}
		System.out.println("Start!");

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン３

		for(int i = 10;i >= 0 ; i--){
			if(i==0){
				System.out.println("Start!");
			}else{
				System.out.println(i);
			}
		}

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■


	}

}
