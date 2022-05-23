package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming"; //str1= str1+" programming", 문자열 연결
		//문자열 연결이지만 실제로는 새로운 문자열을 만들고 str1은 새로운 문자열의 주소값을
		//가리키게 됨.
		System.out.println(str1);
		System.out.println(str1.length()); // 문자열의 길이
		String str2 = str1.concat(" programming"); 
		//concat()으로 문자열 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2)); //charAt(n)번째 문자 리턴
		//인덱스는 0번지부터 시작해서 실제 3번째 문자 찾기
		System.out.println(str2.indexOf("program"));
		//내가 찾고자하는 문자열의 시작문자열의 인덱스값 리턴(알려줌)해줌.
		System.out.println(str2.indexOf("z"));
		//찾고자 하는 문자의 내용이 없으면 -1을 리턴함.
		
		System.out.println(str2.substring(0,4));
		//substring은 문자열을 뽑아옴
		//substring(start, end-1) => (0~3)
		System.out.println(str2.substring(5));
		//substring을 숫자 하나만 쓰면 n부터 끝까지
		//substring(n~)
		
		System.out.println(str2.replace("java", "jsp"));
		//문자열 바꿀때는 문자열.replace(old, new)
		
		String str3 = "3578845698712";
		System.out.println(str3.substring(5,9));
		System.out.println(str3.replace(str3.substring(5,9), "*****"));
		//replace(old(substring(4569), "****")
	}
}
