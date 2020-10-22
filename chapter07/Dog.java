package chapter07;

public class Dog extends Animal {
	
	public Dog(String name, String voice) {
		super(name, voice);
	}

	@Override
	public void live() {
		System.out.println(this.getName() + "は無邪気に生活する");
		// TODO 自動生成されたメソッド・スタブ

	}
	

}
