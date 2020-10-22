package chapter01;

public class Q25 {

	public static void main(String[] args) {
		int x = new java.util.Random().nextInt(21);
		int y = new java.util.Random().nextInt(21);
		int z = new java.util.Random().nextInt(21);

		if (x < Math.min(y, z)) {
			System.out.println(x + "," + Math.min(y, z) + "," + Math.max(y, z));
		} else if (y < Math.min(x, z) ) {
			System.out.println(y + "," + Math.min(x, z) + "," + Math.max(x, z));
		} else {
			System.out.println(z + "," + Math.min(x, y) + "," + Math.max(x, y));
		}

	}

}
