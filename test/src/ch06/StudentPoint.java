package ch06;

public class StudentPoint {
	//전역변수 선언
	static int num[] = {1001, 1002, 1003};
	static String name[] = {"홍길동", "이몽룡", "이순신"};
	static int kor[] = {80, 90, 100};
	static int eng[] = {90, 70, 80};
	static int mat[] = {83, 66, 87};
	static int tot[] = {0, 0, 0};
	static double avg[] = {0, 0, 0};

	//총점계산
	static void getTot() {
		for(int i=0; i<3; i++) {
			tot[i] = kor[i] + eng[i]+mat[i];
		}
	}
	//평균계산
	static void getAvg() {
		for(int i=0; i<3; i++) {
			avg[i] = tot[i] / 3.0;
		}
	}	
	//출력
	static void print() {
		System.out.println("전체학생수 : " + num.length + "명"); //전체학생수 출력
		System.out.println("-----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균"); // 속성값 출력
		System.out.println("-----------------------------------------------------");
		for(int i=0; i<3; i++) { //값출력
			System.out.println(num[i] + "\t" + name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i]+ "\t" + tot[i]+ "\t" +String.format("%.1f", avg[i]));
		}
		System.out.println("-----------------------------------------------------");
	}
		
	//main
	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
		
	}
}
