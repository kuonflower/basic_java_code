package chapter05;

public class Student {
	String name;//生徒の名前
	int[] score;//点数
	
	public Student(String s,int x, int y, int z){
		score = new int[3];
		this.name = s;
		score[0] = x;
		score[1] = y;
		score[2] = z;
		
	}
	
	public int calcTotal(){
		int total = 0;
		for(int t : score){
			total += t;
		}
		
		return total;
	}
	public String makePrintData(){
		String str = "名前" + this.name + "各点" + score[0] + "," + score[1] + "," + score[2] + "合計点" + this.calcTotal();
		return str;
	}

}
