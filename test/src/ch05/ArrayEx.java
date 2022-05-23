package ch05;

public class ArrayEx {
	public static void main(String[] args) {
		
//		int[] score; // 배열참조변수 선언 'score'는 배열참조변수
	//	score = new int [5]; // new를 통해 메모리에 5개의 int형 잡음
		//System.out.println(score);
		//score[0] = 100;
		//score[1] = 90;
		//score[2] = 80;
		//score[3] = 70;
		//score[4] = 60;
		int[] score = {100, 90, 80, 70, 60};
		
		System.out.println(score.length);

		for(int i=0; i<5; i++) {
			System.out.println(score[i]);
		}
		
	} //main
}
