package ch16;

public class MusicPlayer extends Thread{ //thread는 extends, runnable은 implements
	//멤버변수
	int type;
	MusicBox musicBox; //전에 만든 클래스가 데이터타입이 될 수 있음
	
	public MusicPlayer(int type, MusicBox musicBox) { 
		this.type=type;
		this.musicBox=musicBox;
	}
	public MusicPlayer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		switch (type) {
		case 1: musicBox.playMusicA(); break;
		case 2: musicBox.playMusicB(); break;
		case 3: musicBox.playMusicC(); break;
		}
	}
	
}
