package ch04;

public class For_For {
	public static void main(String[] args) {
		//중첩for문
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}//end inner for(
			System.out.println();
		} //end outer for
	} //end main
}
//바깥쪽 포문 초기식으로 시작해서 안쪽 포문을 수행하고 나서 바깥쪽 포문 증감식으로 감