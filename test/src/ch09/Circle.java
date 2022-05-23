package ch09;

public class Circle {
	//멤버 메소드
	private void secret() { //private 처리된 메소드, 변수는 상속안됨
		System.out.println("비밀이다.");
	}
	
	protected void findRadius() {
		System.out.println("반지름 구하기");
	}
	public void findArea() {
		System.out.println("넓이 구하기");
	}
}
