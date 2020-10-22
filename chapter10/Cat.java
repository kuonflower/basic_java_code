package chapter10;

public class Cat {
	
	private char type;
	private String name;
	private int intimacy;
	
	
	
	
	
	
	public Cat(char type, String name) {
		super();
		this.type = type;
		this.name = name;
		this.intimacy = 0;
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
