package chapter01;

public class Q14 {

	public static void main(String[] args) {
		int dice1 = new java.util.Random().nextInt(6) + 1;
		int dice2 = new java.util.Random().nextInt(6) + 1;
		
		System.out.println("サイコロ一の目は" + dice1 + "サイコロ二の目は" + dice2 + "です");
		
		int score = dice1 + dice2;
		
		if (dice1 == dice2) {
			System.out.println("サイコロ一とサイコロ二の合計は" + score + "です" + "ぞろ目なのでスコア二倍の" + score * 2 + "です");
		} else
			System.out.println("サイコロ一とサイコロ二の合計は" + score + "です");

	}

}
