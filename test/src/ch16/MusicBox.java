package ch16;
// 메소드 앞에 synchronized를 붙이면 해당 메소드는 객체의 사용권(Monitoroing Lock)을 얻음
// 해당 메소드가 완전히 끝난 이후 다른 메소드가 실행 될 수 있다.

public class MusicBox {
	public void playMusicA() {
		for(int i=0; i<10; i++) {
			synchronized(this) { //여기서 this는 MusicBox 객체 자신을 가리킴
				System.out.println("신나는 음악!!!");
			}
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} //for
	} //playMusicA()
	
	
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("슬픈 음악!!!");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} //for
	} //playMusicB()
	
	public synchronized void playMusicC() {
		for(int i=0; i<10; i++) {
			System.out.println("카페 음악!!!");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} //for
	} //playMusicC()
	
}
