package ch17;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameColor extends JFrame{
	
	public FrameColor() throws InterruptedException {
		setVisible(true); //프레임을 화면에 표시
		
		//프레임에 컨텐츠를 만들기 위해 처리
		Container c = getContentPane(); //화면에 컨테이너를 표시해주는..
		for(int i=0; i<=255; i++) {
			setSize(i*2, i); //프레임의 사이즈(w, h)
			setLocation(i*2, i); //프레임의 좌표(x, y)
			c.setBackground(new Color(i, 0, 0)); //배경색상 설정(r,g,b)
			Thread.sleep(10); //잠시 멈춤
		}
		for(int i=0; i<=255; i++) {
			setSize(i*2, i); //프레임 사이즈
			setLocation(i*2, i); //프레임의 좌표(x, y)
			c.setBackground(new Color(255, i, 0)); //배경색상 설정(r,g,b)
			Thread.sleep(10); //잠시 멈춤
		}
		//윈도우 닫기 동작 옵션
		setDefaultCloseOperation(EXIT_ON_CLOSE); //프로그램까지 종료
		//DISPOSE_ON_CLOSE //현재창만 닫음
		//HIDE_ON_CLOSE //프로그램 숨김처리
	} //FrameColor()
	
	public static void main(String[] args) throws InterruptedException {
		new FrameColor(); //인스턴스 생성
	}
}
