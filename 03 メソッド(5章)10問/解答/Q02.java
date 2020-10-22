package ensyu;

public class Q02 {

	/*
	 * 名前(String)と年齢(int)を引数で受け取り
	 * 挨拶をするメソッドを作成する。
	 *
	 * mainメソッドで名前と年齢を入力させ、
	 * 実行例のようになるようにせよ。
	 *
	 * [実行例] お名前を入力してください>Yamada 年齢をいれてください>20 Yamada(20)さん、こんにちは!
	 */
	public static void main(String[] args) {
		System.out.println("お名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("年齢をいれてください");
		int age = new java.util.Scanner(System.in).nextInt();
		greeting(name, age);
	}

	public static void greeting(String name,int age){
		System.out.println(name + "(" +age + ")さん、こんにちは");
	}

}
