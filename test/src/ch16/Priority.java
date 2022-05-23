package ch16;

public class Priority extends Thread{
	public static void main(String[] args) {
		Priority e1 = new Priority();
		Priority e2 = new Priority();
		
		//스레드 이름 설정
		e1.setName("스레드1");
		e2.setName("스레드2");
		System.out.println("e1의 기본 우선 순위 : " + e1.getPriority());
		System.out.println("e2의 기본 우선 순위 : " + e2.getPriority());
		
		//스레드의 우선 순위 설정(1~10)
		//10이 최대 우선순위 Thread.MAX_PRIORITY
		//5이 중간 우선순위 Thread.NORM_PRIORITY
		//1이 최소 우선순위 Thread.MIN_PRIORITY
		
		e1.setPriority(Thread.MAX_PRIORITY); // e1 => 1순위
		e2.setPriority(Thread.MIN_PRIORITY); // e2 => 2순위
		e1.start();
		e2.start();
		
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}
}
