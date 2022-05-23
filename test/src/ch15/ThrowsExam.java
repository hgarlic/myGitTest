package ch15;

//예외처리 방법
//1) try~catch 직접처리
//2) throws 예외처리를 클래스에 처리 위임
//  - 메소드 이름 throws 예외처리클래스1, 예외처리클래스2 {} (여러개 가능)
// main메소드 내부의 코드를 실행하다가 예외가 발생하면 직접 trycatch하지말고 throws를 활용하는게 좋음

public class ThrowsExam { 
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000); //Interrupt(cpu 간섭)
			
		}
	}
}