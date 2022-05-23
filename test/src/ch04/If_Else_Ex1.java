package ch04;

public class If_Else_Ex1 {
	public static void main(String[] args) {
		int score = 90;
		String result = ""; //NULL 문자
		
		if (score >= 60) { 
			result = "합격"; //true 일때 
		} else {
			result = "불합격"; //false 일때 
		}
		System.out.println(result);
	}
}
