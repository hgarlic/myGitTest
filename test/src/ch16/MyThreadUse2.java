package ch16;

public class MyThreadUse2 {
	public static void main(String[] args) {
		MyThreadEx2 t1 = new MyThreadEx2("스레드1**");
		MyThreadEx2 t2 = new MyThreadEx2("스레드2++");
		MyThreadEx2 t3 = new MyThreadEx2("스레드3##");

		Thread r1 = new Thread(t1);
		Thread r2 = new Thread(t2);
		Thread r3 = new Thread(t3);
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("------------------");
		r1.start();
		r2.start();
		r3.start();

	}
}
