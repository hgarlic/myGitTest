package ch09;

public class Volume extends Area{ //에어리어 상속
	//멤버변수
	
	private int height;
	
	public Volume() { //기본생성자
	}
	
	public Volume(int width, int length, int height) {
		super(width, length); //부모클래스의 매개변수 2개짜리 생성자 호출
		this.height = height;
	}
	
	public int getVolume() {
		return getArea()*height;
	}
}
