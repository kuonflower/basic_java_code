package ensyu14_27;

public class Q21 {

	public static void main(String[] args) {
		/*
		 * 0~999の乱数を繰り返し生成し、
		 * 777が出るまでの回数を求める。
		 * (while(true)を使うこと ）
		 *
		 * [実行例] 777は509回目に出ました。
		 */
		int count = 0;
		while(true){
			count++;
			int b = new java.util.Random().nextInt(1000);
			if (b == 777){
				break;
			}
		}
		System.out.println("777は" + count + "回目に出ました");
	}

}
