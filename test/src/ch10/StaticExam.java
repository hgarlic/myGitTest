package ch10;
//개별적인값을 사용할때(변할수 있는 값) => non-static을 사용 ex)학생들..성적
//공동적인 값(정해진) 값을 사용할 때는 => static을 사용함 ex)학점 4.0이상, 3.5이상
//static은 값이 정해진것!!! 아니면 일반적이면 논스테틱
public class StaticExam {
	public static void main(String[] args) {
		//main 메소드는 개발자가 직접 메모리에 올릴 수 없기 때문에
		//자동으로 메모리에 올리기 위해서 필연적으로 static으로 써야함
		
		int a=40, b= 30, result;
		result = Math.max(a, b); //  둘 중 큰 값
		System.out.println(result);
		
		result = Math.min(a, b); // 둘 중 작은 값
		System.out.println(result);
		System.out.println(Math.sqrt(100));
		double r = 15.3;
		System.out.println("원의 둘레 : " + 2*Math.PI*r);
		System.out.println("원의 넓이 : " + Math.PI*r*r);
		
	}
}
