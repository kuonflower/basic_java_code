package chapter01;

public class Q24 {

	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		
		System.out.println(x);
		System.out.println(y);
		
		int z = y;
		y = x;
		x = z;
		
		System.out.println(x);
		System.out.println(y);

	}

}
