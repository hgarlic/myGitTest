package ch11;

public class Coin1Demo implements Coin {
	//implements를 Coin을 쓸수도 있고 안쓸수도 있음
	public static void main(String[] args) {
		//인터페이스의 상수는 static의 영역에 있음
		//클래스 이름.상수이름 으로 접근 가능
		
		System.out.println("Dimed은 " + Coin.DIME + "센트입니다.");
	}
}
