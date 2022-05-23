package ch09;

public class Area {
	//멤버변수
	private int width; //int 기본으로 0으로 초기화 됨;
	private int length;
	
	//기본생성자 ( ctrl+ space)
	public Area() {
	}
	
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public int getArea() {
		return width * length;
	}
}
