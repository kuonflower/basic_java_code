package chapter03;

public class Q51 {

	public static void main(String[] args) {
		System.out.println("整数を入れてください。");
		int x = new java.util.Scanner(System.in).nextInt();
		pyramid (x);

	}
	public static void pyramid (int x) {
		int countDown = x;
		for(int i = 0; i < x; i++) {
			for(int j = countDown; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i + 1; k++) {
					System.out.print("■");					
				}
			System.out.println(" ");
			countDown--;
				
			}
	}
}
