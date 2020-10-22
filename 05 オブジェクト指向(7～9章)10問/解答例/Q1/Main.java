package tes1;

public class Main {

	public static void main(String[] args) {

		int selsectNum = 0;
		Car car = new Car(30.0, 8.4, 60.0);

		while (selsectNum != 4) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 走行 / 2. 給油 / 3. 残量表示 / 4. 終了");
			selsectNum = new java.util.Scanner(System.in).nextInt();
			switch (selsectNum) {
			case 1:
				System.out.println("何キロ走行しますか");
				car.run(new java.util.Scanner(System.in).nextDouble());
				break;
			case 2:
				System.out.println("何リットル給油しますか?");
				car.addGasoline(new java.util.Scanner(System.in).nextDouble());
				break;
			case 3:
				car.displayGasoline();
				break;
			}
		}//while
		System.out.println("アプリケーションを終了します。");
	}//main

}
