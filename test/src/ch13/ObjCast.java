package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;
		//부모 : 자식 
		Object obj = 20;
		a=(Integer)obj; //정상적인 형변환, 객체는 객체형끼리 형변환해주는게 좋다.
		// a=(int)obj; 위에께 더 정석적인 방법
		System.out.println(a);
		
		Object[] obj2 = {100,100.5, true, "hello", 'A'};
		//사실은 각 데이터가 Object 객체(Integer, Double, Boolean, String..)이 되버린다.
		//Auto Boxing처리 => 메모리 낭비가 심해짐
		//이렇게 쓰는 일은 없다. 대신 컬렉션 처리(ArrayList등)을 하면
		//단점보완가능.

		for(Object o : obj2) { //향상된 for문 for each문
			System.out.println(o); //오토 언박싱 처리함.
		}
	}
}
