package ch05;

public class StringArray2 {
	public static void main(String[] args) {
		String[] str = {"Java", "DB", "JSP", "Spring"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		//for each문(향상된 for문)
		//for(데이터타입 개별값저장변수 : 집합변수명)
		// ++가 내부적으로 작동되는 메커니즘
		for(String ss: str) {
			System.out.println(ss);
		}
	}
}
