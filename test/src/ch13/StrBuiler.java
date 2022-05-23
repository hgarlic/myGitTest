package ch13;

public class StrBuiler {
	public static void main(String[] args) {
		//String 불변(immutable)
		//StringBuilder 가변(mutable)
		//StringBuffer은 초기버전 StringBuilder는 최신버전
		
		StringBuilder str1 = new StringBuilder();
		str1.append("java");
		//append() 는 문자열 내용을 추가해줌, 메모리절약(String보다)
		System.out.println(str1.toString());
		//System.out.println(str1); 도 되지만 
		//StringBuilder할 때는toString이 원칙임 권장
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");
		 //0부터 3까지 인덱스 내용을 변경해줌(0,1,2,3 총 4개, java -> jsp)
		System.out.println(str1);
		//참고로 replace()메소드는 주로 String 객체의 replace()를 많이 쓰는 편.
		
		String str2= str1.substring(3);
		//substring은 인덱스 3부터 끝까지 출력
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1.toString(); //String str3 = str1 만하면 에러가 남
		//StringBuilder를 String로 바꿀 때는 toString()을 사용
		//String str3 = str1 만하면 에러가 남
		
		System.out.println("StringBuilder(str1) -> String(str3)에 저장 : " + str3);
		
		//String을 StringBuilder로 저장(초기화)할 때
		str1 = new StringBuilder(str3);
		System.out.println("String(str3) -> StringBuilder(str1)에 저장 : " + str1);
		
		
 	}
}
