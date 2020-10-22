package chapter02;

public class Q02 {

	public static void main(String[] args) {
		String[] fruits = new String[3];
		fruits[0] = "Banana";
		fruits[1] = "Aplle";
		fruits[2] = "Orange";
		
		System.out.println("fruits[0]:" + fruits[0] + " " + "fruits[1]:" + fruits[1] + " " + "fruits[2]:" + fruits[2]);
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i] + " ");
		}
	}

}
