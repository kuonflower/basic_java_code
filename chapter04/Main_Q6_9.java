package chapter04;

public class Main_Q6_9 {

	public static void main(String[] args) {
		
		//Q7
		System.out.println("Q7------------------------\n");
		
		System.out.println("四角形の面積を求めます");
		System.out.println("縦の長さを整数で入力してください");
		int depth = new java.util.Scanner(System.in).nextInt();
		System.out.println("横の長さを整数で入力してください");
		int width = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("縦が" + depth + "横が" + width + "の面積は" + ShapeLogic.square(depth, width));
		
		//Q8
		System.out.println("Q8------------------------\n");
		
		System.out.println("三角形の面積を求めます");
		System.out.println("底辺の長さを整数で入力してください");
		int bottom = new java.util.Scanner(System.in).nextInt();
		System.out.println("高さの長さを整数で入力してください");
		int height = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("底辺は" + bottom + "高さは" + height + "三角形の面積は" + ShapeLogic.triangle(bottom, height));
				
		//Q9
		System.out.println("Q9------------------------\n");
		
//		台形の面積は(上底+下底)×(高さ)÷2
		System.out.println("台形の面積を求めます");
		System.out.println("上底の長さを整数で入力してください");
		int topSide = new java.util.Scanner(System.in).nextInt();
		System.out.println("下底の長さを整数で入力してください");
		int bottomSide = new java.util.Scanner(System.in).nextInt();
		System.out.println("高さの長さを整数で入力してください");
		int height2 = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("上底が" + topSide + "下底が" + bottomSide + "高さが" + height +"台形の面積は" + ShapeLogic.trapezoid(topSide, bottomSide, height2));
				
	}

}
