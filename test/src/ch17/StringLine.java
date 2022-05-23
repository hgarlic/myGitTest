package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//JApplet은 Applet의 확장판 1995년에 처음 소개됨
//애플릿뷰어나 웹브라우저와 같이 쓰였음, 게임 및 다양한 그래픽을 구사할 때 활용

//현재는 HTML5 등 웹이 진화되면서 거의 쓰이지 않음.
//라이프사이클을 가지고 있다. init()-start()-stop()-destroy() 생성-실행-멈춤-소멸
//init()은 필수처리해야함, 나머지는 옵션(필요에 의한 선택)

public class StringLine extends JApplet{
	@Override
	public void init() { //애플릿을 초기화시켜줌
		getContentPane().setBackground(new Color(255,255,255)); //배경색상 설정
		setSize(300,300); //애플릿의 화면 사이즈
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);

		//선그리기 drawLine(x좌표1, y좌표1, x좌표2, y좌표2) => 시작점포인트(x1,y1), 종료점포인트(x2,y2)
		g.drawLine(250, 50, 30, 160);
		g.setColor(Color.red);
		
		g.drawString("Red String", 10, 50); //문자열 그리기
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue string", 10, 110);
	}
}
