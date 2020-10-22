package q3;

public class Box {

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//フィールド

	private String color;               //箱の色
	private String shape;               //箱の形
	private int ballAmount;             //箱の中のボールの数
	private static int totalBallAmount; //すべての箱のボールの総数

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//コンストラクタ

	public Box(String color, String shape, int ballAmount) {
		this.color = color;
		this.shape = shape;
		this.ballAmount = ballAmount;
		this.totalBallAmount += ballAmount;
	}

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//メソッド

	//処理内容：引数として渡された個数のボールを箱に入れる
	public void insertBalls(int amount){
		this.ballAmount += amount;
		this.totalBallAmount += amount;
		System.out.println(this.color + "の箱に" + amount + "個のボールを入れました。");
	}

	//処理内容：引数として渡された個数のボールを箱から取り出す
	//         個数が不足する場合はすべてのボールを取り出す
	public void removeBalls(int amount){
		if(this.ballAmount - amount < 0){
			System.out.println(this.ballAmount + "個のボールを取り出しました。");
			this.totalBallAmount -= this.ballAmount;
			this.ballAmount = 0;
		}else{
			System.out.println(amount + "個のボールを取り出しました。");
			this.ballAmount -= amount;
			this.totalBallAmount -= amount;
		}
	}

	//処理内容：箱の色・形、ボールの数を表示する
	public void displayInfo(){
		System.out.println("色：" + this.color + "   形："+this.shape+"   個数："+this.ballAmount);
	}


	//処理内容：すべての箱のボールの総数を表示する
	public static void displayTotalNumber(){
		System.out.println("ボールの合計は"+totalBallAmount+"個です。");
	}

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//getter・setter

	//--------------------------------------
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//--------------------------------------
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	//--------------------------------------
	public int getBallAmount() {
		return ballAmount;
	}

	public void setBallAmount(int ballAmount) {
		this.ballAmount = ballAmount;
	}
	//--------------------------------------
	public static int getTotalBallAmount() {
		return totalBallAmount;
	}

	public static void setTotalBallAmount(int totalBallAmount) {
		Box.totalBallAmount = totalBallAmount;
	}
	//--------------------------------------


}
