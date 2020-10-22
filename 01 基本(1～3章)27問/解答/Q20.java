package ensyu14_27;

public class Q20 {

	public static void main(String[] args) {
		/*
		 * 0~20の乱数を２個生成し、
		 * 大きい方の数値から小さい方の数値を引いた差を求める。
		 *
		 * [実行例] num2:14とnum1:9の差は5です
		 */
		int num1 = new java.util.Random().nextInt(21);
		int num2 = new java.util.Random().nextInt(21);

		if (num1 > num2){
			System.out.println("num1:" + num1 + "num2:" + num2 + " " + "の差は" + (num1 - num2) + "です");
		}else{
			System.out.println("num2:" + num2 + "num1:" + num1 + " " + "の差は" + (num2 - num1) + "です");
		}
	}

}
