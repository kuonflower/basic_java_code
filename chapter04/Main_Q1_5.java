package chapter04;

public class Main_Q1_5 {

	public static void main(String[] args) {

		System.out.println("一つ目の数字を入力してください");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("二つ目の数字を入力してください");
		int y = new java.util.Scanner(System.in).nextInt();
		
		
		int tasuAns = Calculation.tasu(x, y);
		int hikuAns = Calculation.hiku(x, y);
		System.out.println("Q1----------------------------------\n");
		//		Q1
		System.out.println(x + "+" + y + "=" + tasuAns);
		System.out.println("Q2----------------------------------\n");
		//		Q2
		System.out.println(x + "-" + y + "=" + hikuAns);
		System.out.println("Q3----------------------------------\n");
		//		Q3
		
		System.out.println("偶数奇数を判定したい整数を入力してください");
		int xx = new java.util.Scanner(System.in).nextInt();;
		
		
		if(Calculation.evenNumberJudge(xx)){
			System.out.println(xx + "は偶数です");
			
		} else {
			System.out.println(xx + "は奇数です");
		}
		//		Q4
		
		System.out.println("Q4----------------------------------\n");
		
		System.out.println("一つの二けたの数字を入力してください");
		int z = new java.util.Scanner(System.in).nextInt();
		if (Calculation.findNumber(z)) {
			System.out.println("見つかりました");
		} else {
			System.out.println("見つかりませんでした");
		}
		
		System.out.println("Q5----------------------------------\n");
		System.out.println("配列の要素数を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		
		
		
		int[] array;
		
		array = Calculation.arrayGeneration(num);
		System.out.println("配列の中身は");
		for(int aaa : array) {
			System.out.println(aaa);
		}

	}

}
