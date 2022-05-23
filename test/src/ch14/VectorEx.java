package ch14;

import java.util.Vector;

//컬렉션(Collections) - 배열의 단점인 같은 데이터만을 보완한 클래스들
//Map 계열 - 순서는 제공되지 않지만 키가 제공됨.(인덱스가 없고 키로 조회)
//List 계열 - 순서대로 저장, 키는 없음(인덱스로 조회)
//Vector 대신 요즘은 ArrayList를 많이 씀 그러나 GUI에서는 Vector씀


public class VectorEx {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		System.out.println("초기사이즈 : " + v.capacity());
		//벡터는 기본적으로 10개의 사이즈를 만들어줌. 
		//사이즈가 넘어가면 자동적으로 10개씩 늘려줌
		v.add("first");
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		System.out.println("중간사이즈 : " + v.capacity());
		System.out.println("데이터의 갯수 : " + v.size()); //배열의 length와 같은 역할인 size
		
		System.out.println("초기데이터");
		for(int i=0; i<v.size();i++) {
			System.out.print(v.get(i)+"\t");
		}
		System.out.println();
		 //벡터 등 컬렉션은 자료의 추가, 삭제가 용이하다.
		v.remove(0); //벡터의 인덱스 0번 데이터 삭제
		
		v.add(6, 102);
		System.out.println("중간데이터");
		for(int i=0; i<v.size();i++) {
			System.out.print(v.get(i)+"\t");
		}
	}
}
