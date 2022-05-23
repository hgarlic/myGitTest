package ch17;

import javax.swing.JFrame;


//JFrame은 닫기 기능이 자동으로 되어있음

public class JFrameEx extends JFrame{
	public JFrameEx() {
		//1)제목처리
		super("JFrame 예제"); //제목처리
		//2)제목처리
		//setTitle("JFrame 예제"); //제목처리 둘다 가능
		
		
		setSize(300, 200);
		setVisible(true); // true안하면 안보임.
	}
	
	public static void main(String[] args) {
		new JFrameEx();
		
	}
}
