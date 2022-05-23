package ch07;

public class BookStore {
	private String name;
	private String writer;
	private String publisher;
	private int year;
	private int price;
	private int num;
	private int tot;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTot() {
		tot = price * num;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(name+"\t"+writer+"\t"+publisher+"\t"+year+"\t"+price+"\t"+num+"\t"+getTot());
		
	}
	
	
}
