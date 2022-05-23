package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{
	
	public PanelExam() {
		JPanel p = new JPanel(); //패널생성
		
		//패널의 배경색상 설정
		p.setBackground(Color.red);//색은 소문자, 대문자 상관없음
		
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");

		//프레임의 north영역에 패널을 추가
		p.add(button1);
		p.add(button6);
		add(p, BorderLayout.NORTH);
		
		add(button2); //프레임 센터에 button2가 배치가 됨
		//add(button2, "Center"); 이게 정석인데 센터는 생략가능
		add(button3, "South"); //센터이외는 지정해줘야함
		add(button4, "West");
		add(button5, "East");
		
		setSize(300,300); //화면사이즈
		setVisible(true); //화면에 보이게 표시
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//닫기버튼시 프로그램까지 완전종료
		
	} //기본생성자
	
	public static void main(String[] args) {
		new PanelExam(); 
	}
}
