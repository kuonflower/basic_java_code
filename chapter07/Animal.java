package chapter07;

public abstract class Animal implements Creature {
	private String name;
	private String voice;
	
	
	public Animal(String name, String voice) {
		super();
		this.name = name;
		this.voice = voice;
	}
	@Override
	public abstract void live();
	
	public void bark() {
		System.out.println(this.getName() + "は" + this.getVoice());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}

}
