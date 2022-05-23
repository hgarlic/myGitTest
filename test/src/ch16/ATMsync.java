package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mom = new Thread(atm, "mom");
		Thread son = new Thread(atm, "son");
		mom.start();
		son.start();
		
	}
}

class ATM implements Runnable {
	private long depositMoney = 10000;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(int i = 0; i<10; i++) {
				notify(); // 일시정지상태에 있는 스레드를 꺠움
				//wait하고 있는 스레드(한개만)에 [notify신호]를 보낸다.
				// 여러 스레드가 wait(잠자고)하고 있는 경우에도 그 중에 하나만 깨움
				// 어떤 스레드일지는 알 수 없음. 
				// wait을 하고 있는 스레드가 없을 때는 [notify신호]는 그냥 소멸함.
				
				//notifyAll() : wait을 하고 있는 모든 스레드를 깨움
				//이때도 깨어나는 순서는 알 수 없음.
				
				try {
					wait(); 
					//현재 실행 스레드를 일시정지상태로 만들면서 다른 스레드가 먼저 실행되도록 활용
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(getDepositeMoney() <= 0) { // 잔액이 0원 이하면
					break; //for문 빠져나감
				}
				withDraw(1000);
				
			} //for
			
		}
	} //run

	public void withDraw(long howMuch) {
		if(getDepositeMoney() >0) {
			depositMoney -= howMuch;
			System.out.print(Thread.currentThread().getName());
			System.out.printf(" 잔액 : %,d 원 %n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName());
			System.out.println("잔액이 부족합니다.");
		}
	}

	public long getDepositeMoney() {
		return depositMoney;
	}
}
