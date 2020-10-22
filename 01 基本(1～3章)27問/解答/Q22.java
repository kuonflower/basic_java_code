package ensyu14_27;

public class Q22 {

	public static void main(String[] args) {
		/*
		 * 九九の出力をせよ。
		 * ただし、５０より大きい値は出力しない。
		 * (breakを用いる)
		 *
		 * [実行例]
		 * 2 4 6 8 10 12 14 16 18
		 * 3 6 9 12 15 18 21 24 27
		 * 4 8 12 16 20 24 28 32 36
		 * 5 10 15 20 25 30 35 40 45
		 * 6 12 18 24 30 36 42 48
		 * 7 14 21 28 35 42 49
		 * 8 16 24 32 40 48
		 * 9 18 27 36 45
		 */
		for(int i = 2 ; i < 10 ; i++){
			for(int j = 1 ; j < 10 ; j++){
				if(i * j > 50){
					break;
				}
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

}
