package chapter01;

public class Q8 {

	public static void main(String[] args) {
		int score = new java.util.Random().nextInt(101);
		System.out.println("乱数は" + score);
		if (score >= 80) {
			System.out.println("Excellent!!");
		} else if (score >= 50) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}

	}

}
