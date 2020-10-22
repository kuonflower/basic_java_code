package chapter02;

public class Q03 {

	public static void main(String[] args) {
		double[] array = {22.3, 33.1, 11.5};
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		array[0] = 22.5;
		
		System.out.println("最初の要素を" + array[0] + "に変更しました");
	}

}
