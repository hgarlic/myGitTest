package ch11;

public interface RemoteCotrollable extends Controllable {
	//인터페이스끼리는 extends로 상속이 가능함
	
	void remoteOn();
	void remoteOff();
	

}
