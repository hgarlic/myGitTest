package ch09;

public class Ball extends Circle {
	//Ball 클래스의 멤버변수(전역변수)
	private String color;
	
	//Ball 클래스의 멤버 생성자
	public Ball(String color) { //매개변수가 있는 생성자
		this.color = color;
	}
	
	//Ball 클래스의 멤버생성자
	//기본생성자도 코딩해주는 습관을 가지자. 쓰든 안쓰든
	public Ball() {
	}
	
	//Ball 클래스의 멤버메소드
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	
	//Ball 클래스의 멤버메소드
	public void findVolume() {
		System.out.println("부피 구하기");
	}
}
