package chapter08;

public class Main_Q2 {

	public static void main(String[] args) {
		int x = 0;
		Pool p = new Pool();
		
		while(x != 4){
			System.out.println("---------------------------------");
			System.out.println("1.給水  / 2.排水  / 3.表示  / 4.終了");
			x = new java.util.Scanner(System.in).nextInt();
			double water = 0;
			switch(x){
			case 1:
				System.out.println("給水する水量を入力して下さい");
				water = new java.util.Scanner(System.in).nextDouble();
				p.feedWater(water);
				break;
			case 2:
				System.out.println("排水する水量を入力して下さい");
				water = new java.util.Scanner(System.in).nextDouble();
				p.drainWater(water);
				
				break;
			case 3:
				p.display();
				break;
			case 4:
				System.out.println("アプリケーションを終了します。");
				break;
			}
			
			
		}	
	}

}
