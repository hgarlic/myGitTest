package ch04;

import java.util.Scanner;

public class TotalScore {
	public static void main(String[] args) {
		
		int kor;
		int eng;
		int mat;
		String name;
		String grade = "";
		String result = "";
		Scanner in = new Scanner(System.in);


		for(int i=0; i<=2; i++) {
			if(i!=2) {
			System.out.print("이름을 입력하세요 : ");
			name = in.next();
			System.out.print("국어 점수 : ");
			kor = in.nextInt();
			System.out.print("영어 점수 : ");
			eng = in.nextInt();
			System.out.print("수학 점수 : ");		
			mat = in.nextInt();
			int tot = kor + eng + mat; 
			double avg = tot / 3.0;

				if(avg>=90) {
					grade = "수";
				} else if(avg>=80) {
					grade = "우";
				} else if(avg>=70) {
					grade = "미";
				} else if(avg>=60) {
					grade = "양";
				} else {
					grade = "가";
				} //else
	
	result += name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade+"\n";
			} else {
				System.out.print("이름을 입력하세요 : ");
				name = in.next();
				System.out.print("국어 점수 : ");
				kor = in.nextInt();
				System.out.print("영어 점수 : ");
				eng = in.nextInt();
				System.out.print("수학 점수 : ");		
				mat = in.nextInt();
				int tot = kor + eng + mat; 
				double avg = tot / 3.0;

					if(avg>=90) {
						grade = "수";
					} else if(avg>=80) {
						grade = "우";
					} else if(avg>=70) {
						grade = "미";
					} else if(avg>=60) {
						grade = "양";
					} else {
						grade = "가";
					} //else
		
		result += name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade;
			} //else

		}//for
		System.out.println("===================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("---------------------------------------------------");
		System.out.println(result);
		System.out.println("===================================================");
	
	} //main
}
