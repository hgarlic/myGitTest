package ch11;

public class CotrollableDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		Controllable.reset();
		//static 메소드인 reset()은 클래스이름.메소드 로 접근 가능
		
		Computer co = new Computer();
		co.turnOn();
		co.turnOff();
		co.repair();
		Controllable.reset();
	}
}
