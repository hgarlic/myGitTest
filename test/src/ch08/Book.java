package ch08;

public class Book {	//도서 판매 
	//전역변수 선언
	private String bookname;
	private String author; //저자
	private String press; //출판사
	private int year; //출판연도
	private int price; //단가
	private int amount; //판매수량
	private int money; // 판매금액(단가 * 판매수량)
	
	//기본생성자 생성
	public Book() { //다른 생성자 호출시 첫째줄에 this해야함
		this("자바","김선생","한빛", 2020, 20000, 10);
		System.out.println("기본 생성자 호출");
	}

	public Book(String bookname, String author, String press, int year, int price, int amount) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.bookname = bookname;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}
	
	
	public void input(String bookname, String author, String press, int year, int price, int amount) {
		this.bookname = bookname;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}
	
	public void print() {
		System.out.println("도서이름\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookname+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+money);
	}
	
	

}
