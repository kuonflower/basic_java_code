package chapter05;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(30.0, 8.4, 60.0);
		double distance = 0;
		double litre = 0;
		
		int x = 0;
		while(x != 4){

			System.out.println("1. 走行 / 2. 給油 / 3. 残量表示 / 4. 終了");
			x = new java.util.Scanner(System.in).nextInt();
			switch(x){

			case 1:
				System.out.println("何キロ走行しますか??");
				car.run(distance = new java.util.Scanner(System.in).nextDouble());
				break;
			case 2:
				System.out.println("何リットル給油しますか?");
				car.addGasoline(litre = new java.util.Scanner(System.in).nextDouble());
				break;
			case 3:
				car.displayGasoline();
				break;
			case 4:
				System.out.println("アプリケーションを終了します。");
				break;

			}

		}

	}

}
