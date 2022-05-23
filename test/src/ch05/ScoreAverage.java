package ch05;

public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = {
				{3.3, 3.6}, //1학년 1,2학기 평점
				{3.5, 3.2}, //2학년
				{3.7, 4.0},// 3학년
				{4.1, 4.2} //4학년
				};
		
		double sum = 0.0;
		for(int year=0; year<score.length; year++) { //각 학년별 반복 (행)
			for(int term=0; term<score[year].length; term++) {
				//각 학년의 학기별로 반복(열)
				sum += score[year][term]; //전체 평점 합을 계산
			}//inner for
		} // outer for
		int n = score.length; //배열의 행 갯수(4개) 를 담음
		int m = score[0].length; // 배열의 열 갯수 (2개) 를 담음
		
		System.out.println("4년 전체 평점 평균은 " + String.format("%.1f", sum/(n*m)));
	} //main
}
