package ch06;
//재귀호출
//팩토리얼 계산방법

public class RecursiveEx {
	public static void main(String[] args) {
		System.out.println(fact1(25)); // 5! = 5*4*3*2*1
	}

	static long fact1(int n) {
		//큰 수를 다룰때는 데이터 타입을 BigInteger를 사용하거나 배열 사용
		return n==1 ? 1 : n*fact1(n-1);
	}
	
	
}
