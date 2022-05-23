package ch14;

public class Type3<T>{ //자료형이 미정인 상태 <아무문자>
	T t; // 변수도 자료형이 미정

	public T getT() { 
		return t;
	}

	public void setT(T t) { //자료형 미정
		this.t = t;
	}
	public static void main(String[] args) {
		//인스턴스를 생성할 때 자료형을 결정함. => 제너릭(일반화)
		Type3<String> t = new Type3<String>();
		t.setT("100");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3 t3 = new Type3(); 
		//<>자료형을 주지 않고 일반적인 방법으로 new해도 실행은 되지만 경고뜸
		//이렇게 되면 내부적으로 다 object처리해서 메모리 낭비가 큼
	}
	

}
