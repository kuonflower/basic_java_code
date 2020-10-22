package chapter08;

public class Pool {

	private double water;
	private final double MAX_WATER = 600.0;

	public Pool() {
		super();
		this.water = 0.0;
	}

	public void feedWater(double water) {
		double actual = 0;
		if (water < 0) {
			System.out.println("給水量は正の値をいれてください。");
		} else if (this.water + water > 600.0) {
			actual = this.MAX_WATER - this.water;
			this.water = this.MAX_WATER;
			System.out.println(actual + "立方メートル給水しました");
		} else {
			actual = water;
			this.water += water;
			System.out.println(actual + "立方メートル給水しました");
		}

	}

	public void drainWater(double water) {
		double actual = 0;
		if (water < 0) {
			System.out.println("排水量は正の値をいれてください。");
		} else if (this.water - water < 0) {
			actual = this.water;
			this.water = 0;
			System.out.println(actual + "立方メートル排水しました。");
		} else {
			actual = water;
			this.water -= water;
			System.out.println(actual + "立方メートル排水しました。");
		}

	}

	public void display() {
		System.out.println("現在の水量は" + this.water + "立方メートルです。");
	}

}
