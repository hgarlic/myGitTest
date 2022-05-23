package ch09;

public class SportsCar extends Car { //부모객체 Car를 상속받는 자식클래스 SportsCar
	boolean turbo; //스포츠카의 멤버변수
	
	//SportsCar의 멤버메소드
	public void setTurbo(boolean flag) { //SportsCar 터보 모드 설정 메서드
		turbo = flag;
		System.out.println(turbo);
	}
}
