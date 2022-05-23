package ch11;

public class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 종료합니다.");

	}

}
