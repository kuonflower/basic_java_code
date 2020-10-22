package chapter07;

public class Rose extends Plant {

	public Rose(String name, String color) {
		super(name, color);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void live() {
		System.out.println(this.getName() + "は光合成して生きる");

	}

}
