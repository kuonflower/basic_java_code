package chapter03;

public class Q07 {

	public static void main(String[] args) {
		System.out.println("お名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		hello(name);

	}
	
	public static void hello(String name){
		System.out.println(name  + "さん、こんにちは！");
	}

}
