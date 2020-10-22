package q1_5;

public class Main {
	public static void main(String[] args){

		//Ｑ１
		int a = 2;
		int b = 3;
		System.out.println(a +" + " + b + " = " + Calculation.tasu(a, b));

		//Ｑ２
		System.out.println("1つめの整数を入力して下さい");
		int c = new java.util.Scanner(System.in).nextInt();
		System.out.println("２つめの整数を入力して下さい");
		int d = new java.util.Scanner(System.in).nextInt();
		System.out.println(c +" - " + d + " = " + Calculation.hiku(c, d));

		//Ｑ３
		System.out.println("1つの整数を入力して下さい");
		int e = new java.util.Scanner(System.in).nextInt();
		boolean result = Calculation.evenNumberJudge(e);
		if(result){
			System.out.println("偶数です");
		}else{
			System.out.println("奇数です");
		}

		//Ｑ４
		System.out.println("１つの２桁の整数を入力してください");
		int f = new java.util.Scanner(System.in).nextInt();
		boolean result = Calculation.findNumber(f);
		if(result){
			System.out.println("見つかりました");
		}else{
			System.out.println("見つかりませんでした");
		}

		//Ｑ５
		System.out.println("配列の要素数を入力して下さい");
		int g = new java.util.Scanner(System.in).nextInt();
		int[] result = Calculation.arrayGeneration(g);
		System.out.println("配列の中身は・・・");
		for(int item : result){
			System.out.println(item);
		}



	}//main
}
