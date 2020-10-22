package ensyu;

/*価格（int）を引数で受け取り、消費税込みの値段を表示するメソッドを作成する。
mainメソッドで価格を入力させ、実行例のようになるようにせよ。

[実行例]
価格を入力してください>100
100円は消費税込みで108円です*/
public class Q08 {

	public static void main(String[] args) {
		System.out.println("価格を入力してください");
		int price = new java.util.Scanner(System.in).nextInt();
		calTax(price);
	}

	public static void calTax(int price) {
		final double TAX = 1.08;
		int addPrice = (int) (price * TAX);
		System.out.println(price + "は消費税込みで" + addPrice + "円です");
	}
}
