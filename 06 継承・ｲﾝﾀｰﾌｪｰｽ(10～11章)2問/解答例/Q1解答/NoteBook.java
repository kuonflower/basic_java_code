package ren;

public class NoteBook extends Book {

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//フィールド

	private String text = "";

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//コンストラクタ

	public NoteBook(int pageNum, int price) {
		super(pageNum, price);
	}

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//メソッド

	public void display(){
		super.display();
		System.out.println("内容 : " + this.text);
	}

	//ノートに内容を追加書き込みする
	public void writing(){
		System.out.println("書き込む内容を書いて下さい");
		String inputText = new java.util.Scanner(System.in).nextLine();
		if(inputText.length() != 0 ){
			System.out.println("書き込みました");
			this.text += inputText;
		}else{
			System.out.println("１文字以上入力してください");
		}
	}//writing

	//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	//getter・setter

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}//class

