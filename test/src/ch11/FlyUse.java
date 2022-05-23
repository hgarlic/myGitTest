package ch11;

public class FlyUse {
	public static void main(String[] args) {
		//첫번째 객체 생성방법
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		//두번째 다형성기법
		//좌변은 부모, 우변은 자식
		Flyer f = new Bird();
		System.out.println(f); 
		f.takeOff();//f3키 누르면 해당되는 부모 Flayer의 메소드가 나옴
		f.fly();
		f.land();
		
		f= new Airplane();
		System.out.println(f);
		f.takeOff();
		f.fly();
		f.land();
	}
}
