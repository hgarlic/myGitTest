package ch16;

//멀티스레드 : 작업단위가 2개 이상
//구현방법 1 : Thread 상속(extends)
//구현방법 2 : Runnable을 구현(implements)

public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(name); //부모클래스의 생성자호출
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //1초 멈춤
		}
	}
	
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");

		e1.start(); //스레드 객체이름.start() ==> run() 런메소드 자동 호출
		e2.start(); //위와 동시에 호출
		e3.start();
	}
}
