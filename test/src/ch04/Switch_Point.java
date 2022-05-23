package ch04;

public class Switch_Point {
	public static void main(String[] args) {
		int kor = 100;
		int mat = 100;
		int eng = 100;
		int tot = kor + mat + eng;
		double avg = tot / 3.0;
		
		String grade ="";
		
		switch((int)(avg / 10)) { //double int로 형변환함. switch는 정수, 문자만 가능
		case 10:
		case 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		default :
			grade = "가";
			break;
		} //switch
		
		//결과 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s", kor, eng, mat, tot, avg, grade);

		
	} // main 
}
