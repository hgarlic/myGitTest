package ch07;

public class Car {
	//멤버 변수(=전역변수)
	String color; //색상
	int speed; // 속도
	int gear; // 기어
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	void changeGear(int g) {
		gear = g;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public void setGear(int gear) {
		this.gear = gear; // 전역변수 = 로컬변수
	}
	public int getGear() {
		return gear;
	}
	
	void print() {
		System.out.println("차량 색상 : " + color);
		System.out.println("차량 속도 : " + speed + "km");
		System.out.println("차량 기어단수 : " + gear + "단");
	}
	
	void speedUp( ) {
		speed = speed + 10;
	}
	
	void speedDown() {
		speed = speed -10;
	}
}
