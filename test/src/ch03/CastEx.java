package ch03;

public class CastEx {
	public static void main(String[] args) {
		//자료형 변환
		float f = 1.6f; //float은 4바이트
		System.out.println(f);
		
		f = 100; // int형인 100이라는 정수값을 float형인 f가 자동으로 100.0으로 형변환
		//자동 형변환(확장형)이라 함.
		System.out.println(f);
		
		f = 100.5f;
		int i = (int)f; //큰 값에서 작은 값으로 변환할 때는 강제 형변환을 개발자가 명시적으로 해줘야함
		System.out.println(i);
	}
}
