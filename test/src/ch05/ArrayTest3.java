package ch05;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};
		//for문으로 데이터 출력
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(int ss: numbers) {
			System.out.println(ss);
		}
	}
}
