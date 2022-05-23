package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameExam {
	public static void main(String[] args) {
		Frame f = new Frame("프레임 제목"); //프레임제목설정
		//윈도우창과 같은 화면을 띄우는 클래스
		
		f.setSize(200, 300); // 프레임의 사이즈를 설정함
		f.setVisible(true); //프레임을 화면에 표시, false하면 안보임
		
		//1)화면 닫기기능 추가(익명내부클래스 사용)
//		f.addWindowListener(new WindowListener() { //익명내부클래스
//			
//			@Override
//			public void windowOpened(WindowEvent e) {}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//프로그램을 종료시킴
//				//정상종료 : 0, 비정상종료 : -1
//				System.exit(0); 
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {}
//		});
		//2) 종료기능 추가 (Adapter사용) - 보통은 이거 씀 코드 간략
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
