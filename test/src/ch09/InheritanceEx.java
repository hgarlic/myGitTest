package ch09;

public class InheritanceEx {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨강색"); // 객체 생성과 동시에 매개변수가 있는 생성자 호출한 것
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("공 : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
		//c2.secret(); 은 private처리되어 상속관계라하더라도 접근금지
		//해당 클래스(부모클래스인 Circle)에서만 사용 가능함.
	}
}
