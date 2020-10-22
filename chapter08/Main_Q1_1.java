package chapter08;

public class Main_Q1_1 {

	public static void main(String[] args) {

		Pokemon[] p = new Pokemon[3];

		p[0] = new Pokemon("ヒトカゲ",100);
		p[1] = new Pokemon("ゼニガメ", 50);
		p[2] = new Pokemon("フシギダネ", 200);


		for(int i = 0; i < p.length;i++){
			for(int j = 0; j < p.length; j++){
			if (p[i].getHp() > p[j].getHp()){
				Pokemon temp = p[i];
				p[i] = p[j];
				p[j] = temp;
			}


			}
		}

		for(Pokemon po : p){
		System.out.println(po.getName() + " " + po.getHp());
		}

	}

}
