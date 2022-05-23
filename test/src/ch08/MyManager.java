package ch08;

public class MyManager {
	private int score; 
		
	private MyManager(int score) {
		this.score = score;
	}
	//먼저 정의될때는private static 클래스 이름(MyManager) 참조변수(mgr);
	private static MyManager mgr;
	
	//public static 클래스이름(MyManager) 메소드이름()(getInstance)
	public static MyManager getInstance() {
		if(mgr==null) { //처음 MyManager가 객체화 될 때의 경우
			mgr = new MyManager(10);
		} 
		return mgr; // 한번이상 객체 생성이 되었다면 즉, 주소값이 있으면 그 값을 리턴
		
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
