package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame{

	
	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);

	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g); // JFrame 의 paint 메소드 실행시킴
		
		//drawString("문자열", x좌표값, y좌표값) : 문자열을 그래픽형태로 출력해주는 메소드
		g.drawString("hello java", 10, 60);
		g.drawOval(30, 100, 50, 50); //drawOval(x좌표, y좌표, 가로, 세로)
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);
		g.drawRect(100, 200, 60, 60); //사각형 
		g.setColor(Color.yellow);
		g.fillOval(200, 200, 60, 60);
		System.out.println("paint 호출....");
	}
	public static void main(String[] args) {
		new PaintExam();
		
	}
}
