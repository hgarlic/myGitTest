package ch07;

public class Radio {
	//멤버변수(전역변수)
	double channel; //채널번호
	int volume; //음량
	boolean onOff; //전원상태

	@Override
	public String toString() {
		return "Radio [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}

	double getChannel() {
		return channel;
	}
	
	int getVolume() {
		return volume;
	}
	
	void setChannel(double ch) {
		channel = ch; // 전역변수 = 로컬변수
	}
	
	void getVolume(int vo) {
		volume = vo; // 전역변수 = 로컬변수
	}
	
	
	
}
