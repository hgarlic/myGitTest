package ch03;

public class BitNot {
		//비트연산자 연습( not(~))
	public static void main(String[] args) {
		byte a = 10;
		System.out.println(a);
		System.out.println(~a);
		//비트값을 반전시킴(0을 1로, 1을 0으로 바꾸는데 실제 계산시에는
		//첫번째로 반전하고 다시 반전시킬 때 오른쪽 끝 비트를 제외하고
		//반전시킨 후 앞의 부호도 반전시킴
		//1010을
		//0101로 바꾸고 마이너스를 한 후 다시 -1010으로 가다가 마지막 자리를 1로 바꿔줌
		//십진수로 -11이 됨
		
		int i = 8;
		System.out.println(8);
		System.out.println(~8);
		//1000을
		//0111로 바꾸고 마이너스를 한 후 다시 -1000으로 가다가 마지막 자리를 1로 바꿔줌
		//십진수로 -9가 됨
	}
}
