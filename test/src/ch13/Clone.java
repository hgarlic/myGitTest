package ch13;

//인스턴스(객체)를 복제하려면 implements Cloneable 처리해줘야함

public class Clone implements Cloneable {
	int num = 10;
	void print() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Clone t1 = new Clone();
		Clone t2 = null;
		
		try { //예외가 발생할 가능성의 코드들을 try절에서 처리
			//좌변 : Clone(자식) = 우변 : Object(부모)
			t2 = (Clone)t1.clone(); //인스턴스를 복제함
			//clone은 Object의 11가지 메소드 중 하나
			//clone()은 Object의 메소드이기 때문에
			//좌, 우변을 맞춰줘야함 => (Clone)형변환 해야함
		} catch (CloneNotSupportedException e) { //예외 발생
			e.printStackTrace();
			//e.printStackTrace(); 개발자를 위해 제공해주는 메소드, 디버깅 정보 제공
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}
}
