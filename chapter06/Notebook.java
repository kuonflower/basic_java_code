package chapter06;

public class Notebook extends Book {
	String str = "";

	public Notebook(int page, int price) {
		super(page, price);
	}
	
	public void Write(String str){
		this.str += str;
	}
	
	public void printData(){
		super.printData();
		System.out.println("内容 :" + str);
	}

}
