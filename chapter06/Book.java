package chapter06;

public class Book {
	private int page;
	private int price;
	
	
	public Book(int page, int price) {
		super();
		this.page = page;
		this.price = price;
	}
	
	public void printData(){
		System.out.println("ページ数：" + this.page);
		System.out.println("価格 :" + this.price);
	}

	public int getPage() {
		return page;
	}

	public int getPrice() {
		return price;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
