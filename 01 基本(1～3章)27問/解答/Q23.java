package ensyu14_27;

public class Q23 {

	public static void main(String[] args) {
		/*
		 * 1~20を順番に出力する。
		 * ただし、３の倍数は出力しない。 
		 * (continueを用いる)
		 *
		 * [実行例] 1 2 4 5 7 8 10 11 13 14 16 17 19 20
		 */
		for(int i = 1;i < 21; i++){
			if (i % 3 ==0){
				continue;
			}
			System.out.println(i);
		}
	}
}
