package chapter01;

public class Q19 {

	public static void main(String[] args) {
		System.out.println("いくつ★を出力しますか？");
		int star = new java.util.Scanner(System.in).nextInt();
		
		for(int i = 0; i < star; i++) {
			System.out.print("★");
		}

	}

}
