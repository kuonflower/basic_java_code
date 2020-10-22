package q1;

public abstract class Plant implements Creature {

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//フィールド

	String name;
	String color;

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//コンストラクタ

	public Plant(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//メソッド

	@Override
	public abstract void live();

	public void makeFlowers(){
		System.out.println(this.name +"は"+this.color+"の花を咲かせる");
	}



}//class
