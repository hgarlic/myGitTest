package ch05;

public class ArraySum {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		int sum = 0;
//		for(int i=0; i<5; i++) {
//			sum = sum + num[i];
			
//			System.out.println(num[i]);
//		} //for
		
		//위 for문 대신에 조건식에 length속성을 쓰면 배열데이터 변화가 있더라도 대응 가능
		
		for(int i=0; i<num.length; i++) {
			sum = sum + num[i];
			
			System.out.println(num[i]);
		} //for
		System.out.println("합계 : " + sum);
		
		
	} // main
}
