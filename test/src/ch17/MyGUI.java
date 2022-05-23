package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;

public class MyGUI extends JApplet implements MouseListener{
	private int x, y; //이미지를 출력할 x, y 좌표값
	private Image img; //이미지 car.gif 사용할 변수
	private boolean flag = false; //이미지가 처음 실행할 때는 안보이게끔 하기 위해 불린값으로 false로 처리
	
	@Override
	public void init() {
		setSize(300, 300);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("dog.png"));
		this.addMouseListener(this);

	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(flag) { //마우스를 클릭 시 true로 바뀌게 설정
			g.drawImage(img, x, y, this);}
			//drawImage(이미지, x, y, 이미지 관찰자);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true; //클릭할 때 그림을 ture로 설정해서 보여지게함
		x = e.getX();
		y = e.getY();
		repaint(); //그래픽 갱신 요청 =>paint() 자동 호출됨

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 진입 위치 x:"+x + ", y:" + y);
		x = e.getX();
		y = e.getY();
		repaint(); //그래픽 갱신 요청 =>paint() 자동 호출됨

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
