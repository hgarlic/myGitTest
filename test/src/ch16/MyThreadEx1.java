package ch16;

public class MyThreadEx1 extends Thread{
	String str;
	public MyThreadEx1(String str) {
		this.str= str;
	}
	public MyThreadEx1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for(int i=0; i<=2; i++) {
			System.out.println(str);
		}
	}
}
