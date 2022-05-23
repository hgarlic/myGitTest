package ch05;

//3차원 배열 : 배열명 = new 자료형 [면][행][열]
public class Array3Dim {
	public static void main(String[] args) { //2면 3행 4열
		String[][][] subject = {
				//1면
				{{"JS01", "AL02","PY03","DS04"} //과목코드 
				//[0][0][0], [0][0][1], [0][0][2], [0][0][3]
				,{"JSP","알고리즘","파이썬","자료구조"} //과목명
				//[0][1][0], [0][1][1], [0][1][2], [0][1][3]
				,{"이길동","김길동","박길동","홍길동"}}, //지도교수
				
				//2면
				{{"CS01","CS02","CS03","CS04"} //과목코드
				,{"생활영어","경제학","생활체육","스포츠"} //과목명
				,{"구길동","성길동","최길동","황길동"}} //지도교수	
		};
		
		for(int i = 0; i<subject.length; i++) { //면으로 처리할 for문
			for(int j = 0; i<subject[i].length; j++) { //열로 처리할 for문
				for(int k = 0; k<subject[i][j].length; k++) {
					System.out.println("[" + i + "][" + j + "][" + k + "] : " + subject[i][j][k]);
				}
				
			} //중간 for
			System.out.println("==============================");
		} //맨 바깥쪽 for(면)
		
	}
}
