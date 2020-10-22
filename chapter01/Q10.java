package chapter01;

public class Q10 {

	public static void main(String[] args) {
		int x = 0;
		for (int i = 0; i < 10; i++) {
			int score = new java.util.Random().nextInt(101);
			if (score >= 50) {
				x++;
			}
		}
		System.out.println("50以上のスコアは" + x + "個ありました");

	}

}
