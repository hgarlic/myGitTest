package ch09;

public class SportsCarTest {
	public static void main(String[] args) {
		
		//obj는 SportsCar이지만 SportsCar는 Car를 상속받기 때문에 Car의 
		// 부모클래스인 Car의 기능, 메소드를 쓸 수 있음
		SportsCar obj = new SportsCar();
		obj.speed = 10;
		obj.setSpeed(60);
		obj.setTurbo(true);
		
		//정리 : 상속받는 객체는 "부모님꺼는 내꺼" 라는게 성립
		//그러나 접근제어자 private는 상속못함
	}
}
