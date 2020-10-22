package chapter01;

public class Q9 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < 5; i++) {
			int x = new java.util.Random().nextInt(10);
			sum += x;
			
		}
		avg = (double)sum / 5;
		System.out.println("5個の数値の合計は" + sum + "平均は" + avg);

	}

}
