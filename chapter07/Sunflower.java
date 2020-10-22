package chapter07;

public class Sunflower extends Plant {

	public Sunflower(String name, String color) {
		super(name, color);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void live() {
		System.out.println(this.getName() + "は太陽の方向を向いて生きる");

	}

}
