package ch11;

public class Boat implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Voat SpeedUp");

	}

	@Override
	public void speedDown() {
		System.out.println("Voat SpeedDown");

	}

	@Override
	public void handle() {
		System.out.println("Voat Handling");

	}

}
