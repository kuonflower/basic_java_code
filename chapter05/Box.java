package chapter05;

public class Box {
	private String color;//箱の色
	private String shape;//箱の形
	private int ballAmount;//箱の中のボールの数
	private static int totalBallAmount;//すべての箱のボールの総数(共有)


	public Box(String color, String shape, int ballAmount){
		this.color = color;
		this.shape = shape;
		this.ballAmount = ballAmount;
		totalBallAmount += ballAmount;
	}


	public void insertBalls(int kosuu){
		this.ballAmount += kosuu;
		totalBallAmount += kosuu;

	}
	public void removeBalls(int kosuu){
		int actual = 0;
		if(this.ballAmount - kosuu < 0){
			actual = this.ballAmount;
			this.ballAmount = 0;
			totalBallAmount -= actual;
		}else {
			actual = kosuu;
			this.ballAmount -= kosuu;
			totalBallAmount -= actual;
		}
		System.out.println(actual + "個のボールを取り出しました");
	}
	public void displayInfo(){
		System.out.print("箱の色は" + this.color);
		System.out.print("        箱の形は" + this.shape);
		System.out.println("        この箱のボールの数は" + this.ballAmount);
	}
	public static void displayTotalNumber(){
		System.out.println("全ての箱のボールの総数は" + totalBallAmount);
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public int getBallAmount() {
		return ballAmount;
	}


	public void setBallAmount(int ballAmount) {
		this.ballAmount = ballAmount;
	}

}
