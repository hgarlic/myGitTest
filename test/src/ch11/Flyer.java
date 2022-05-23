package ch11;

//interface도 abstract 클래스처럼 new를 못함.

public interface Flyer { 
	//인터페이스에는 추상메소드만 있어야함.(툭수향 경우를 제외하고)
	public void takeOff(); 
	public void fly();
	public void land();
	
}
