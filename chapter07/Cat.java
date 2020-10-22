package chapter07;

public class Cat extends Animal {

	public Cat(String name, String voice) {
		super(name, voice);
	}
	@Override
	public void live() {
		System.out.println(this.getName() + "はのんびり生活する");
		// TODO 自動生成されたメソッド・スタブ

	}
	
}
