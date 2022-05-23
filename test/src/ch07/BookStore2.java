package ch07;

public class BookStore2 {
	//전역변수 생성
	private String name;
	private String writer;
	private String publisher;
	private int year;
	private int price;
	private int num;
	private int tot;
	
	public void input(String name, String writer, String publisher, int year, 
			int price, int num) {
		this.name=name;
		this.writer=writer;
		this.publisher=publisher;
		this.year=year;
		this.price=price;
		this.num=num;
		tot = price * num;
	}
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(name+"\t"+writer+"\t"+publisher+"\t"+year+"\t"+price+"\t"+num+"\t"+tot);
		
	}
	
}