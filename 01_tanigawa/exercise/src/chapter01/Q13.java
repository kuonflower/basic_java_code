package chapter01;

public class Q13 {

	public static void main(String[] args) {
		System.out.println("信号機で渡って良い信号の色を漢字一文字で答えてください");
		String color = new java.util.Scanner(System.in).nextLine();
		
		switch (color) {
		
		case "青":
		case "緑":
			System.out.println("OK!");
			break;
			default:
				System.out.println("NG");
		}

	}

}
