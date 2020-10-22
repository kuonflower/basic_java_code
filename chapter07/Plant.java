package chapter07;

public abstract class Plant implements Creature {
	private String name;
	private String color;


	public Plant(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	@Override
	public abstract void live();

	public void makeFlowers() {
		System.out.println(this.getName() + "は" + this.getColor() + "の花を咲かせた");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
