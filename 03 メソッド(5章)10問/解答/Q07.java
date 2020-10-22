package ensyu;
/*名前(String)を引数で受け取り、挨拶をするメソッドを作成する。
mainメソッドで名前を入力させ、実行例のようになるようにせよ。

[実行例]
お名前を入力してください>Yamada
Yamadaさん、こんにちは!*/
public class Q07 {
	public static void main(String[] args){
		System.out.println("お名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		aisatu(name);
	}

	public static void aisatu(String name){
		System.out.println(name + "さん、こんにちは！");
	}
}
