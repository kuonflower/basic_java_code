package chapter06;

public class Main_Q1 {

	public static void main(String[] args) {
		
		System.out.println("本のページ数を入力してください");
		int bPage = new java.util.Scanner(System.in).nextInt();
		System.out.println("本の価格を入力してください");
		int bPrice = new java.util.Scanner(System.in).nextInt();
		System.out.println("ノートのページ数を入力してください");
		int nPage = new java.util.Scanner(System.in).nextInt();
		System.out.println("ノートの価格を入力してください");
		int nPrice = new java.util.Scanner(System.in).nextInt();
		
		Book b = new Book(bPage, bPrice);
		Notebook n = new Notebook(nPage, nPrice);
		
		int x = 0;
		
		while(x != 4){
			
			System.out.println("---------------------------------------");
			System.out.println("1.本の情報表示   /  2.ノートの情報表示   /  3.ノートに追加書込   /  4.終了");
			x = new java.util.Scanner(System.in).nextInt();
			switch(x){
			
			case 1:
				b.printData();
				break;
			case 2:
				n.printData();
				break;
			case 3:
				System.out.println("書き込む内容を書いて下さい");
				String str = new java.util.Scanner(System.in).nextLine();
				n.Write(str);
				System.out.println("書き込みました");
				break;
			case 4:
				System.out.println("アプリケーションを終了します。");
				break;
			}
		}

	}

}
