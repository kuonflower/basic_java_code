package q6_10;

public class Main {

	public static void main(String[] args) {

		//Ｑ７
		System.out.println("四角形の面積を求めます");
		System.out.println("縦の長さを整数で入力してください");
		int vertical = new java.util.Scanner(System.in).nextInt();
		System.out.println("横の長さを整数で入力してください");
		int horizontal = new java.util.Scanner(System.in).nextInt();
		int result = ShapeLogic.square(vertical, horizontal);
		System.out.println("縦が"+ vertical + "横が" + horizontal + "の四角形の面積は"+ result);

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		//Ｑ８
		System.out.println("三角形の面積を求めます");
		System.out.println("底辺を整数で入力してください");
		int bottom = new java.util.Scanner(System.in).nextInt();
		System.out.println("高さを整数で入力してください");
		int height = new java.util.Scanner(System.in).nextInt();
		int result = ShapeLogic.triangle(bottom, height);
		System.out.println("底辺が"+ bottom + "高さが" + height + "の三角形の面積は"+ result);

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		//Ｑ９
		System.out.println("台形の面積を求めます");
		System.out.println("上底を整数で入力してください");
		int upperSide = new java.util.Scanner(System.in).nextInt();
		System.out.println("下底を整数で入力してください");
		int underSide = new java.util.Scanner(System.in).nextInt();
		System.out.println("高さを入力してください");
		int height = new java.util.Scanner(System.in).nextInt();
		int result = ShapeLogic.trapezoid(upperSide, underSide, height);
		System.out.println("上底が"+upperSide+"、"
					     + "下底が"+underSide+"、"
					     + "高さが"+height+"の、"
					     + "台形の面積は"+result);
	}

}
