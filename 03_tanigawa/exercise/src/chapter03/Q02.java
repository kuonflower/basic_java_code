package chapter03;

public class Q02 {

	public static void main(String[] args) {
		System.out.println("名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("年齢を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		
		hello(name, age);
	}
	
	public static void hello(String name, int age) {
		System.out.println(name + "(" + age + ")さん、こんにちは！");
	}

}
