package chapter01;

public class Q20 {

	public static void main(String[] args) {
		int num1 = new java.util.Random().nextInt(21);
		int num2 = new java.util.Random().nextInt(21);
		
		int x = Math.max(num1, num2);
		int y = Math.min(num1, num2);
		
		System.out.println(x - y);
		
		if (num1 >= num2) {
			System.out.println("大きいほうの数字num1の値" + num1 + "からnum2の値" + num2 + "を引いた値は" + (num1 - num2));
		} else {
			System.out.println("大きいほうの数字num2の値" + num2 + "からnum1の値" + num1 + "を引いた値は" + (num2 - num1));
		}

	}

}
