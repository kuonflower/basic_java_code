package chapter02;

public class Q05 {

	public static void main(String[] args) {
		boolean[] array = {true, false, false, true, true};
		
		System.out.println("第何戦の結果を調べますか？");
		int num = new java.util.Scanner(System.in).nextInt() - 1;
		
		if(array[num]) {
			System.out.println("第" + (num + 1) + "戦の結果は「勝ち」です");
		} else {
			System.out.println("第" + (num + 1)+ "戦の結果は「負け」です");
		}

	}

}
