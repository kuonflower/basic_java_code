package enshu8_12;

public class Q12 {

	public static void main(String[] args) {
		/*
		 * １～１００の乱数を100個作り
		 * その中に77があるかを探索する。
		 * あれば、その最初のインデックスを表示し、
		 * なければ「含まれていない」と表示する。
		 * [実行例]
		 * インデックス52が77です
		 */
		int[] ransuu = new int [100];
		int snum = 77;
		boolean iFlag = false;
		int index = 0;

		//配列を作るときは作るだけ
		for (int i = 0; i < ransuu.length ; i++){
			ransuu[i] = new java.util.Random().nextInt(100) + 1;
		}

		//判定は判定だけ
		for (int i = 0; i < ransuu.length ; i++){
			if (ransuu[i] == snum){
				index = i;
				iFlag = true;
				break;
			}
		}

		//出力は出力だけ
		if(iFlag == true){
			System.out.println("インデックス" + index + "が" + snum  + "です");
		}else{
			System.out.println("含まれていない");
		}
	}
}
