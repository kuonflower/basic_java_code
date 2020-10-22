package chapter01;

public class Q22 {

	public static void main(String[] args) {
		//「Q22」クラスを作成し、
		//九九の出力をせよ。ただし、５０より大きい値は出力しない。
		//(breakを用いる)
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int ans = i * j;
				
				if (ans > 50) {
				break;
				}
				System.out.print(" " + ans);
			}
			System.out.println("");
		}

	}

}
