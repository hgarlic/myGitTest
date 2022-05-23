package ch09;

public class Scholar extends Student{ //장학생은 학생이다. is a관계
	//즉 상속관계에 있어 부모클래스의 멤버들을 그대로 쓸 수 있음(변수, 메소드)
	
	private String category; //장학금 종류
	private int money; //장학금 금액
	
	public void input(String name, String num, String major, int year, 
			String category, int money) {
		super.intput(name, num, major, year);
		this.category= category;
		this.money = money;
		//super() = > 부모클래스의 생성자 호출
		//super. => 부모클래스의 메소드, 변수 호출
		//this() => 현재 클래스의 생성자 호출
		//this. => 현재 클래스의 변수, 메소드 호출
		
	}
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear()+"\t"+category+"\t"+money);
	}
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear());	
	}
}
