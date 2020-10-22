package chapter01;

public class Q21 {

	public static void main(String[] args) {
		int x = new java.util.Random().nextInt(1000);
		int count = 1;
		while (x < 777 || x > 777) {
			count++;
			x = new java.util.Random().nextInt(1000);
		}
		System.out.println("777は" + count + "回目に出ました");

	}

}
