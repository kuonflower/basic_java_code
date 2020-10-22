package chapter01;

public class Q1 {

	public static void main(String[] args) {
		String name = "谷川";
		int age = 32;
		String food = "ポテト";
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("好きな食べ物は" + food + "です");
		
		System.out.println("今夜食べたいものは？入力してください");
		String dinner = new java.util.Scanner(System.in).nextLine();
		System.out.println("今夜食べたいものは" + dinner + "です");
	}

}
