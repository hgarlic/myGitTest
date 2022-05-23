package ch05;

public class ArrayScore2D {
	public static void main(String[] args) {
		int[][] score = {{100,100,100,0,0},{90,90,90,0,0},{80,80,80,0,0},
				{70,70,70,0,0},{60,60,60,0,0}};
		char grade;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		
		for(int i=0; i<score.length; i++) {
			int num= i+1; //번호출력
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = score[i][3] /3;

			if(score[i][4]>=90) {
				grade = 'A';
			} else if (score[i][4]>=80) {
				grade = 'B';
			} else if (score[i][4]>=70) {
				grade = 'C';
			} else if (score[i][4]>=60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println(num +"\t"+ score[i][0]+"\t"+ score[i][1]+"\t"+ score[i][2]+"\t"+ score[i][3]+"\t"+ score[i][4]+"\t"+grade);

		} 

	}
}
