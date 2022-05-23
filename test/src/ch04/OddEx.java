package ch04;
//1부터 10까지 홀수, 짝수값의 핪 구하기 (FOR, IF문 활용)

/* 출력결과:
 * 1~10 사이의 홀수의 합은 ? 00 */

public class OddEx {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				sum += i;
				
			} //end if
		} //end for   
		System.out.println("출력결과: ");
		System.out.println("1~10 사이의 홀수의 합은? " +sum);

	} //end main
}
