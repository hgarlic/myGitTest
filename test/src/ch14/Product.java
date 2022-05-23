package ch14;

public class Product {
	private String name; //제품명
	private String co; //제조사
	private String day; //제조일자
	private int price; //단가
	private int count; //수량
	private int money; //금액
	//getter,setter,생성자
	public Product() {
	}
	public Product(String name, String co, String day, int price, int count) {
		super();
		this.name = name;
		this.co = co;
		this.day = day;
		this.price = price;
		this.count = count;
		//this.money = money;
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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	

	
}
