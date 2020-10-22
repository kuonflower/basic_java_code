package chapter07;

public class Main_Q1 {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[2];
		
		animals[0] = new Dog("柴犬" , "わんわん");
		animals[1] = new Cat("タマ", "にゃーにゃー");
		
		Plant[] plants = new Plant[2];
		
		plants[0] = new Rose("薔薇", "赤");
		plants[1] = new Sunflower("ひまわり", "黄");
		
		System.out.println("動物でまとめた処理\n-------------------------------");
		for(Animal a : animals) {
			a.bark();
		}
		
		System.out.println("植物でまとめた処理\n-------------------------------");
		for(Plant p : plants) {
			p.makeFlowers();
		}
		
		System.out.println("生き物でまとめた処理\n-------------------------------");
		Creature[] c = new Creature[4];
		
		for(int i = 0; i < 2; i++) {
			c[i] = animals[i];
			c[i + 2] = plants[i];
		}
		for(Creature  cc : c) {
			cc.live();
		}

	}

}
