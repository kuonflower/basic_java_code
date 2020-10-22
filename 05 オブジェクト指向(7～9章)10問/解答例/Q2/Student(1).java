package q2;

public class Student {

	public String name;
	public int[] scores;

	//コンストラクタ
	public Student(String name, int x , int y , int z) {
		super();
		this.name = name;
		this.scores = new int[3];
		this.scores[0] = x;
		this.scores[1] = y;
		this.scores[2] = z;
	}

	//点数の合計を返す
	public int calcTotal(){
		int sum = 0;
		for(int item : scores){
			sum += item;
		}
		return sum;
	}

	//名前と各点と合計点を返す
	public String makePrintData(){
		String msg = "";
		msg += this.name + " : ";
		for(int i = 0 ; i < scores.length ; i++){
			msg += scores[i];
			if(i < scores.length - 1){
				msg += ",";
			}
		}
		msg += "  合計点は" + calcTotal();
		return msg;
	}

}
