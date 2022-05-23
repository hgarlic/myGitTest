package ch16;

public class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	
	public MyThread() {
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000); //cpu 1초 잠재우기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("run메소드 실행");
		}
	}
}
