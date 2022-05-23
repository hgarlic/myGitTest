package ch12;

interface RemoteControl{
	
	//추상메소드(구현부가 없는 메소드)
	void turnOn();
	void turnOff();
}


public class AnonymousClassTest {
	public static void main(String[] args) {
		//인터페이스는 new해서 객체생성을 못함
		//무명클래스 처리하면 자동적으로 인터페이스를 무명클래스가 상속을 받아 오버라이딩 처리
		
		RemoteControl ac = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}

			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");
				
			}
			
		}; // 블럭다음에 세미콜론 나오면 무명내부클래스
		
		ac.turnOn();
		ac.turnOff();
	}
}
