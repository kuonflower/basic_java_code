package q2;

public class Main {

	public static void main(String[] args) {

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		// パターン１

		// コンストラクタを用いてインスタンス化
		Student nobita = new Student("のび太", 0, 0, 0);
		Student suneo = new Student("すねお", 54, 31, 32);
		Student dekisugi = new Student("出木杉", 100, 100, 100);

		// 表示
		System.out.println(nobita.makePrintData());
		System.out.println(suneo.makePrintData());
		System.out.println(dekisugi.makePrintData());

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		// パターン2

		// intやString等は型である
		// クラスも型に出来る
		// つまりクラスも配列に出来る

		// Student型の配列生成
		Student[] students = new Student[6];

		//各要素にインスタンス化をして格納
		students[0] = new Student("ドラえもん", 51, 18, 98);
		students[1] = new Student("ミニドラ", 85, 15, 25);
		students[2] = new Student("ドラミちゃん", 92, 38, 25);
		students[3] = new Student("のび太母", 56, 75, 19);
		students[4] = new Student("のび太父", 75, 97, 99);
		students[5] = new Student("ジャイアン", 36, 30, 0);

		//配列をfor文でまわし、各々のメソッドを呼ぶ
		for(int i = 0 ; i < students.length ; i++){
			System.out.println(students[i].makePrintData());
		}

		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■


	}

}
