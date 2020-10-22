package chapter02;

public class Q07 {

	public static void main(String[] args) {
		System.out.println("何人？");
		int nums = new java.util.Scanner(System.in).nextInt();
		
		int[] scores = new int[nums];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "人目の点数を入力してください");
			scores[i] = new java.util.Scanner(System.in).nextInt();
		}
		int ans = 0;
		for(int i = 0; i < scores.length; i++) {
			ans += scores[i];
			
		}
		System.out.println("合計点は" + ans);
		
		int ans2 = 0;
		for (int a: scores) {
			ans2 += a;
		}
		System.out.println(ans2);

	}

}
