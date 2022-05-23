package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {
	public static void main(String[] args) {
		int num[] = {29, 1, 8, 70, 13, 92, 36};
		Arrays.sort(num);
		for(int i : num) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		//내림차순( 내림차순은 특별히 Integer라는 Warpper Class 타입으로 데이터 처리가 되야하고
		// Collections.reverseOrdr() 라는 메소드를 써서 처리해야 한다.
		Integer rev[] = {29, 1, 8, 70, 13, 92, 36};
		Arrays.sort(rev, Collections.reverseOrder());
		for( int i : rev) {
			System.out.print(i + " ");
		}
	}
}
