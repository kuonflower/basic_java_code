package chapter05;

public class Main_Q3 {

	public static void main(String[] args) {

		Box[] array = new Box[3];

		array[0] = new Box("赤色", "四角形", 3);
		array[1] = new Box("緑色", "円形", 2);
		array[2] = new Box("黄色", "三角形", 4);

		int count = 0;
		int x = 0;
		while(x != 4){
			System.out.println("---------------------------------------------------------");
			System.out.println("１:ボール投入 / 2:ボール取出 / 3:ボール総数表示 / 4:終了");
			x = new java.util.Scanner(System.in).nextInt();
			switch(x){
			case 1:
				for(Box b : array){
					System.out.print(count + "---");
					b.displayInfo();
					count++;
				}
				count = 0;
				
				System.out.println("ボールを投入する箱の番号を入力して下さい");
				int boxNum = new java.util.Scanner(System.in).nextInt();
				System.out.println("投入するボールの個数を入力して下さい");
				int inBall = new java.util.Scanner(System.in).nextInt();
				array[boxNum].insertBalls(inBall);
				System.out.println(array[boxNum].getColor() + "の箱に" + inBall +"個のボールを入れました");
				
				break;
			case 2:
				for(Box b : array){
					System.out.print(count + "---");
					b.displayInfo();
					count++;
				}
				System.out.println("ボールを取り出す箱の番号を入力して下さい");
				boxNum = new java.util.Scanner(System.in).nextInt();
				System.out.println("取り出すボールの個数を入力して下さい");
				int outBall = new java.util.Scanner(System.in).nextInt();
				array[boxNum].removeBalls(outBall);
				break;
			case 3:
				Box.displayTotalNumber();
				break;
			case 4:
				System.out.println("アプリケーションを終了します。");
				break;
			}
		}


	}

}
