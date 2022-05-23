package ch14;

import java.util.ArrayList;
import java.util.List;

//ArrayList : Vector와 사용법은 비슷하지만 좀 더 가볍고 속도가 빠름

public class ListExam {
	public static void main(String[] args) {
		//ArrayList<Object> list = new ArrayList<>();
		//실무에서는 위와 달리 좌변은 부모, 우변은 자식의 다형성 형태로 처리.
		List<Object> list = new ArrayList<>(); 
		
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.remove(0); //인덱스 0번지 데이터 삭제
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + "\t");
			
		}
	}
}
