package q1;

public abstract class Animal implements Creature {

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//フィールド

	String name;
	String voice;

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//コンストラクタ

	public Animal(String name, String voice) {
		super();
		this.name = name;
		this.voice = voice;
	}

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//メソッド

	// 今回は実装しないが、後々のことを踏まえれば
	// 抽象メソッドがあるということを明記したほうが
	// 望ましい(同じ内容でオーバーライドする)
	@Override
	public abstract void live();

	public void bark(){
		System.out.println(this.name +"は"+ this.voice);
	}


}//class

