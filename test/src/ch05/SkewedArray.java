package ch05;

public class SkewedArray {
	public static void main(String[] args) {
		 int intArray[][] = new int[4][];
		 intArray[0] = new int[3]; // 첫째 행에 3개의 열을 생성하는 것
		 intArray[1] = new int[2]; // 2번째 행에 2개의 열 생성
		 intArray[2] = new int[3]; // 3번째 행에 3개의 열 생성
		 intArray[3] = new int[2]; // 4번째 행에 2개의 열 생성
		 
		 for(int i = 0; i<intArray.length; i++) { //행에 대한 반복
			 for(int j=0; j<intArray[i].length; j++) { //열에 대한 반복
				 intArray[i][j] = (i+1)*10 + j; //비정방향 배열의 데이터로 사용
			 } //inner
		 } //outer
		 for(int i=0; i<intArray.length; i++) { 
			 for(int j=0; j<intArray[i].length; j++) {
				 System.out.print(intArray[i][j]+ "  "); //활용된 데이터 출력 용도
			 } //inner
			 System.out.println();
		 } //outer
		 
	} //main
}
