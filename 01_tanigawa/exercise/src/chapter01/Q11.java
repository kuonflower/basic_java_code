package chapter01;

public class Q11 {

	public static void main(String[] args) {
		System.out.println("英語で10月を入力してください");
		String x = new java.util.Scanner(System.in).nextLine();
		
		if (x.equals("October")) {
			System.out.println("OK!");
		} else {
			System.out.println("NG");
		}
		
	} 
}