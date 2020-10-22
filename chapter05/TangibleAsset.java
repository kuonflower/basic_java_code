package chapter05;

public abstract class TangibleAsset extends Asset implements Thing{
	
	double weight;
	
	String color;
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		
		this.color = color;
	}
	
	

	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public String getColor() {
		return color;
	}
	

}
