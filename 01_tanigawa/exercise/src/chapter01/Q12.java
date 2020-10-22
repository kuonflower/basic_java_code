package chapter01;

public class Q12 {

	public static void main(String[] args) {
		System.out.println("スペイン語で日曜を何ていうか番号でお答えください1:Lunes2:Jueves3:Domingo");
		int ans = new java.util.Scanner(System.in).nextInt();
		
		switch (ans) {
		
		case 1:
			System.out.println("NG");
			break;
		case 2:
			System.out.println("NG");
			break;
		case 3:
			System.out.println("OK!");
			break;
		}
	}

}
