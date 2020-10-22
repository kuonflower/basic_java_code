package q1;

public class Initialize {

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//本のインスタンスを生成するメソッド
	public static Book createBookInstance(){

		System.out.println("本のページ数を入力してください");
		int bookPage = new java.util.Scanner(System.in).nextInt();
		System.out.println("本の価格を入力してください");
		int bookPrice = new java.util.Scanner(System.in).nextInt();

		return new Book(bookPage, bookPrice);
	}//createBookInstance

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//ノートのインスタンスを生成するメソッド
	public static NoteBook createNoteBookInstance(){

		System.out.println("ノートのページ数を入力してください");
		int noteBookPage = new java.util.Scanner(System.in).nextInt();
		System.out.println("ノートの価格を入力してください");
		int noteBookPrice = new java.util.Scanner(System.in).nextInt();

		return new NoteBook(noteBookPage, noteBookPrice);
	}//createNoteBookInstance

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

}//class
