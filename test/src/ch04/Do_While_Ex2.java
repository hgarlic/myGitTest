package ch04;

public class Do_While_Ex2 {
	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.println(n + "Hello World"); //조건과 상관없이 무조건 1번 실행함
			n++;
		} while(n <= 10);
		System.out.println("While문 빠져나옴");
	}
}
