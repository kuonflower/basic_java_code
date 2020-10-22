package q4_3;


public class Main {

	public static void main(String[] args) {

		//配列生成
		Student_Q4[] students = new Student_Q4[3];

		//コンストラクトを用いてインスタンスを生成して、配列に格納
		students[0] = new Student_Q4("のび太", 100);
		students[1] = new Student_Q4("しずか", 90);
		students[2] = new Student_Q4("じゃいあん", 55);

		//拡張for文で回す
		for(Student_Q4 item : students){
			System.out.println(item.name + " : " + item.score);
		}

	}//main

}//class
