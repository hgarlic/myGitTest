package ch16;

public class MyBank {
	int money;
	public void bankPlayerA() {
		synchronized(this) { 
			money = 10;
			for(int i=0; i<5; i++) {
				notify();
				try {
					Thread.sleep(500);
					System.out.println("홍길동님의 통장잔고는 " + money + " 만원입니다.");
					money += 10;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		} //for
		} //synchronized
		System.out.println();
	} //bankPlayerA()
	
	public MyBank() {} //기본생성자

	public synchronized void bankPlayerB() {
		money = 20;
		for(int i=0; i<5; i++) {
			System.out.println("사임당님의 통장잔고는 " + money + " 만원입니다.");
			money += 10;
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	

		System.out.println();
	} //bankPlayerB()
	
	public void bankPlayerC() {
		synchronized(this) { 
			money = 30;
			for(int i=0; i<5; i++) {
				notify();
				try {
					Thread.sleep(500);
					System.out.println("이몽룡님의 통장잔고는 " + money + " 만원입니다.");
					money += 10;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		} //for
		} //synchronized
		System.out.println();
	} //bankPlayerC()
}
