package chapter05;

public class Asset {
	public Asset(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	String name;
	int price;
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
