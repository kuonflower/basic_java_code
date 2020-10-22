package ensyu14_27;

public class Q16 {

	public static void main(String[] args) {
		/*
		 * 0~100の乱数を繰り返し発生させ、
		 * 100が出るまでの回数を数える。
		 * (do~whileを使うこと)
		 *
		 * [実行例] 11回めに100が出ました！
		 */

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン１

		int num = 0;
		int i =0;
		
		do {
			i++;
			num = new java.util.Random().nextInt(101);
		}while(num != 100);
		System.out.println(i + "回目に100が出ました！");

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン２

		int num = 0;
		int i =0;

		do{
			i++;
			num = new java.util.Random().nextInt(101);
			if (num == 100){
				break;
			}
		}while(true);
		System.out.println(i + "回目に100が出ました！");

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	}

}
