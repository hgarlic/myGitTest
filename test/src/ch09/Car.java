package ch09;

public class Car {
	int speed;//속도, Car의 멤버변수
	
	//Car의 멤버메소드
	public void setSpeed(int speed) { //속도변경 메서드
		this.speed = speed;
		System.out.println(speed);
	}
	
}
