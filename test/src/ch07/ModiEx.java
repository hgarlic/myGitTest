package ch07;

//접근제어지정자(Aceess Modifier)
//public : 모든 위치에서 참조가능
//protected : 같은 패키지 또는 다른 패키지에서 접근시 상속관계가 있을 경우 참조가능
//default : 같은 패키지내에서만 사용 가능(실제 default라고 쓰지 않고 비워둠)
//private : 해당 클래스 내부에서만 사용 가능

public class ModiEx {
	//멤버변수
	public String name = "kim";
}
