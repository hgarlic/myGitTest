package ch10;

//final변수
//1. 값을 변경할 수 없음
//2. 초기값이 반드시 필요함
//3. 대문자로 작성, 2단어 이상일때는 _(언더바)로 연결하는 것이 좋다.
public class FinalVar {
	final static int MAX_NUM = 500; //변수에 final을 붙이면 값이 변경안됨
	//final staitc int MAX_NUM; =>오류, final변수는 전역변수화 했을때 선언만 하면 에러
	public static void main(String[] args) {
		int max = 100;
		System.out.println(max);
		
		System.out.println(MAX_NUM);
		//MAX_NUM = 200; => final 변수(상수)는 값을 수정할 수 없음.
		
	}
}
