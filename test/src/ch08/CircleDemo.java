package ch08;

class Circle{
	//멤버변수 선언
	private double radius;
	private String color;
	
	//생성자 활용
	public Circle(double r, String c) {
		radius = r;
		color = c;
		//변수이름이 전역변수와 다르면 this 생략 가능함
	}
	public Circle(double r) {
		radius = r;
		color = "파랑";
		//변수이름이 전역변수와 다르면 this 생략 가능함
	}
	public Circle(String c) {
		radius = 10.0;
		color = c;
		//변수이름이 전역변수와 다르면 this 생략 가능함
	}
	public Circle() {
		radius = 10.0;
		color = "빨강";
		//변수이름이 전역변수와 다르면 this 생략 가능함
	}
	public void print() {
		System.out.println("반지름 : " + radius);
		System.out.println("색 깔 : " + color);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강");
		c1.print();
		
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle("노랑");
		c3.print();
		
		Circle c4 = new Circle();
		c4.print();
		
	}
}
