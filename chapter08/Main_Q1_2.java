package chapter08;

public class Main_Q1_2 {

	public static void main(String[] args) {
		Person[] p = new Person[100];
		for(int i = 0; i < 100; i++) {
			int y = new java.util.Random().nextInt(6) ;
			int x = new java.util.Random().nextInt(1000) ;
			String str = null;
			
			switch(y) {
			case 0:
				str = "A";
				break;
			case 1:
				str = "B";
				break;
			case 2:
				str = "C";
				break;
			case 3:
				str = "D";
				break;
			case 4:
				str = "E";
				break;
			case 5:
				str = "F";
				break;
			}
			
			p[i] = new Person(str, x);
			
		}
		
		for(Person pe : p) {
			System.out.println(pe.getName() + "[" + pe.getScore() + "]");
		}
		
		for(int i = 0; i < p.length; i++) {
			for(int j = 0; j < p.length; j++) {
				if(p[i].getScore() > p[j].getScore()) {
					Person temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
		System.out.println("-------------------------------------------------------");
		for(Person pe : p) {
			System.out.println(pe.getName() + "[" + pe.getScore() + "]");
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "………" + p[i].getName() + "[" + p[i].getScore() + "]");
			
		}

	}

}
