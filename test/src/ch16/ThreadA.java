package ch16;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b) { // b=> ThreadB 객체에 대해 동기화 블럭 설정
			try {
				System.out.println("b가 완료될 때까지 기다립니다.");
				b.wait(); 
				// main스레드 입장에서 ThreadB에게 자신은 wait하겠다고 알려주는 것
				// 즉, wait()은 잠금(모니터링 락)을 풀고, 다른 스레드에서 notify(All)을 기다리는 상태로 돌아감
				// notify가 도착하면 다시 잠금 시도하여 잠기면 실행을 이어간다.
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total is : " + b.total);
		}
	}
}


class ThreadB extends Thread {
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
				System.out.println(i+"를 더합니다.");
				total += i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} //for
			notify(); //synchronizde를 하면 wait상태가 생기는데 wait 상태를 runnable상태로 
			//=>wait하고 있는 스레드 깨움
			
		} //synchronizde {}
		super.run();
	}
	
}
