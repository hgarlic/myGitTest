package ch04;

public class Do_While_Char {
	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			c=(char)(c+1); //영문의 경우 1을 더하면 다음 문자의 코드값
		} while(c <= 'z');
	}
}
