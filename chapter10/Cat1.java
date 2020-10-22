package chapter10;

public class Cat1 {

	private char type;
	private String name;
	private int intimacy;

	public Cat1(char type, String name){
		this.type = type;
		this.name = name;
		this.intimacy = 0;


	}

	public void play(){
		this.intimacy++;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIntimacy() {
		return intimacy;
	}

	public void setIntimacy(int intimacy) {
		this.intimacy = intimacy;
	}



}
