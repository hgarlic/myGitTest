package ch15;

public class ThrowExam {
	//throw: 예외를 직접 발생시킴, 테스트용외에는 거의 쓸일없음
	
	static void test(int n) {
		if(n == 0) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		test(0);
		
	}
}
