package ch12;

class Outer{
	class InstanceInner{
		int a=100;
	} //inner class
	static class StaticInner{
		int a = 200; //non-static 
		static int b = 300; //static member
	}
	void myMethod() {
		class LocalInner{
			int a = 400;
		} //inner class
		LocalInner i = new LocalInner();
		System.out.println("i.a : " + i.a);
	} //end myMethod()
}


public class InnerEx {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i = oc.new InstanceInner();
		System.out.println("i.a : " + i.a);
		System.out.println("Outer.StaticInner.b : "+ Outer.StaticInner.b);
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a : "+ si.a);
		//static은 참조변수이름.new가 아닌 그냥 new만 하면됨.?
		
		oc.myMethod();
		
		
	}
}
