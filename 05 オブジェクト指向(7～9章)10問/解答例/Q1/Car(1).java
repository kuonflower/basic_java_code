package tes1;

public class Car {

	public double gasoline;
	public double nenpi;
	public double gasolineMax;

	// コンストラクタ
	public Car(double gasoline, double nenpi, double gasolineMax) {
		super();
		this.gasoline = gasoline;
		this.nenpi = nenpi;
		this.gasolineMax = gasolineMax;
	}

	// ガソリン残量を表示
	public void displayGasoline() {
		System.out.println("現在の燃料は" + this.gasoline + "リットルです。");
	}

	// ガソリンを給油するメソッド。gasolineは給油量(リットル)
	// gasolineMaxを超えないようにする。
	public void addGasoline(double gasoline) {
		if (this.gasoline + gasoline > this.gasolineMax) {
			System.out.println((this.gasolineMax - this.gasoline) + "リットル給油します。");
			this.gasoline = this.gasolineMax;
		} else {
			this.gasoline += gasoline;
			System.out.println(gasoline + "リットル給油します。");
		}
		System.out.println("現在の燃料は" + this.gasoline + "リットルです。");
	}

	// 車を走行させるメソッド。distanceは走行距離(キロメートル)
	// １㎞走るとnenpi分消費する
	public void run(double distance) {
		if (this.gasoline - (distance / this.nenpi) < 0) {
			System.out.println("ガソリンが足りません");
		} else {
			System.out.println(distance + "キロ走行します");
			this.gasoline -= distance / this.nenpi;
		}
	}

}
