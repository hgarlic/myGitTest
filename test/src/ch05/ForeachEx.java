package ch05;

public class ForeachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	//enum은 배열보다 간편한 방식으로 단지 데이터를 나열해서만 쓰면 됨.

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		int sum=0;
		
		for(int a : n) {
			System.out.print(a+ " "); //반복되는 a값 출력
			sum += a;
			
		}
		System.out.println("합은 : " + sum);
		
		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day : Week.values()) {
			System.out.print(day + "요일 ");
		}
	}
}