package ensyu14_27;

public class Q25 {

	public static void main(String[] args) {
		/*
		 * 0~20の乱数を３個生成し、
		 * それを小さい順に出力する。
		 * [実行例]
		 * ３つの乱数を小さい順に並べました。
		 * 6,13,20
		 */
		

		int x = new java.util.Random().nextInt(21);
		int y = new java.util.Random().nextInt(21);
		int z = new java.util.Random().nextInt(21);

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン１

		System.out.println("３つの乱数を小さい順に並べました。");
		if(x < y && x < z){
			if (y < z){
				System.out.println(x +"," + y + "," + z);
			}else{
				System.out.println(x + "," + z + "," + y);
			}
		}else if(y < z && y < x){
			if (x<z){
				System.out.println(y +"," + x + "," + z);
			}else{
				System.out.println(y + "," + z +"," + x);
			}
		}else{
			if(y < x){
				System.out.println(z + "," + y + "," + x);
			}else{
				System.out.println(z + "," + x + "," + y);
			}
		}

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		//パターン２

		int temp = 0;
		if(x > y){
			temp = x;
			x = y;
			y = temp;
		}
		if(x > z){
			temp = x;
			x = z;
			z = temp;
		}
		if(y > z){
			temp = y;
			y = z;
			z = temp;
		}
		System.out.println(x + "," + y + "," +z);

		//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	}
}
