package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object();
		//좌변 부모(첫조상), 우변 자식(wapper class) => 다형성
		obj = new Integer(20); 
		//참조변수에는 원래 주소값이 들어감 jdk1.5부터는 value가 들어갈 수 있도록
		//내부처리(intValue() 등 호출)하도록 했음. (Auto Boxing처리)
		System.out.println(obj);// 오토 언박싱(Auto Unboxing)
		obj = new Double(20.5);
		System.out.println(obj);
		obj = "hello";
		System.out.println(obj);
		
	}
}
