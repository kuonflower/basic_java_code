package chapter01;

public class Q16 {

	public static void main(String[] args) {
		
		int count = 0;
		int x;
		do {
			x = new java.util.Random().nextInt(101);
			count++;
			
		} while (x != 100);
		System.out.println(count + "回目に100が出ました");

	}

}
