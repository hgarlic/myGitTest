package ch08;

public class Member {
	//전역변수 선언
	private String name;
	private String userId;
	private int price;
	private String grade;
	
	public Member() {
		this("홍길동", "hong", 120000);
	}

	public Member(String name, String userId, int price) {
		this.name = name;
		this.userId = userId;
		this.price = price;
		if(price >= 100000) {
			grade = "gold";
		} else if(price >= 50000) {
			grade = "silver";
		} else {
			grade = "bronze";
		}
	}
	
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userId+"\t"+price+"\t"+grade);
	}
	
}
