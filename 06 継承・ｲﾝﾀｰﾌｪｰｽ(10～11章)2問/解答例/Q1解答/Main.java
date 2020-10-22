package ren;

public class Main {

	public static void main(String[] args) {

		//初期化処理を担当するInitializeクラスに本のインスタンスを生成してもらう
		Book book = Initialize.createBookInstance();

		//初期化処理を担当するInitializeクラスにノートのインスタンスを生成してもらう
		NoteBook noteBook = Initialize.createNoteBookInstance();

		while(true){

			System.out.println("----------------------------------------------------------------");
			System.out.println("1.本の情報表示   /  2.ノートの情報表示   /  3.ノートに追加書込   /  4.終了");
			int selectNum = new java.util.Scanner(System.in).nextInt();

			switch(selectNum){
			case 1:
				book.display();
				break;
			case 2:
				noteBook.display();
				break;
			case 3:
				noteBook.writing();
				break;
			}//switch

			if(selectNum == 4){
				break;
			}

		}//while

		System.out.println("アプリケーションを終了します。");

	}//main
}//class
