package ch07;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television(); // Television.java의 객체생성(메모리에 올림)
		//tv는 참조변수, 참조변수는 메모리의 주소값을 가지고 있음
		
		tv.channel = 7; //tv.(참조변수이름.) => 인스턴스화 된 Television 클래스 메모리 주소값으로 접근
		tv.onOff = true;
		tv.volume = 9;
		System.out.println("TV의 채널은 " + tv.channel + "이고 볼륨은 " + tv.volume +"입니다.");
		
		
		
	}
}
