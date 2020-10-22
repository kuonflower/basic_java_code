package q3;

public class Main {

	public static void main(String[] args) {

		Box[] boxs = new Box[3];
		boxs[0] = new Box("赤色", "四角形", 3);
		boxs[1] = new Box("緑色", "円形", 2);
		boxs[2] = new Box("黄色", "三角形", 4);

		int selectNum = 0;

		while (selectNum != 4) {

			System.out.println("-----------------------------------------------------");
			System.out.println("１:ボール投入 / 2:ボール取出 / 3:ボール総数表示 / 4:終了");

			selectNum = new java.util.Scanner(System.in).nextInt();

			switch (selectNum) {
			case 1:
				for(int i = 0 ; i < boxs.length ; i ++){
					System.out.print(i + "---");
					boxs[i].displayInfo();
				}
				System.out.println("ボールを投入する箱の番号を入力して下さい");
				int case1_index = new java.util.Scanner(System.in).nextInt();
				System.out.println("投入するボールの個数を入力して下さい");
				int case1_amount = new java.util.Scanner(System.in).nextInt();
				boxs[case1_index].insertBalls(case1_amount);
				break;
			case 2:
				for(int i = 0 ; i < boxs.length ; i ++){
					System.out.print(i + "---");
					boxs[i].displayInfo();
				}
				System.out.println("ボールを取り出す箱の番号を入力して下さい");
				int case2_index = new java.util.Scanner(System.in).nextInt();
				System.out.println("取り出すボールの個数を入力して下さい");
				int case2_amount = new java.util.Scanner(System.in).nextInt();
				boxs[case2_index].removeBalls(case2_amount);
				break;
			case 3:
				Box.displayTotalNumber();
				break;
			}//switch
		}//while
		System.out.println("アプリケーションを終了します。");
	}//main
}//class
