package ch14;

import java.util.Scanner;

public class Product2 {
	private String num; //제품 일련번호
	private String name; //제품명
	private String co; //제조사
	private String day; //제조일자
	private int price; //단가
	private int count; //수량
	private double money; //금액
	
	public void input() {
		Scanner scan = new Scanner(System.in);
				System.out.println("일련번호 : ");
				num = scan.next();
				System.out.println("제품명 : ");
				name = scan.next();
				System.out.println("제조사 : ");
				co = scan.next();
				System.out.println("제조일자 : ");
				day = scan.next();
				System.out.println("단가 : ");
				price = scan.nextInt();
				System.out.print("수량 : ");
				count = scan.nextInt();
				//money = (price*count)+((price*count)*0.1);
	}
	
	
	
	//getter, setter, 생성자
	public Product2() {
	}
	public Product2(String num, String name, String co, String day, int price, int count, int money) {
		super();
		this.num = num;
		this.name = name;
		this.co = co;
		this.day = day;
		this.price = price;
		this.count = count;
		this.money = money;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCo() {
		return co;
	}
	public void setCo(String co) {
		this.co = co;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
	
	
}
