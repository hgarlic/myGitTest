package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

//MouseListener : 마우스 이벤트 처리를 위한 인터페이스
//MouseMotionListener : 마우스 이동 이벤트 처리를 위한 인터페이스
//KeyListener : 키보드 이벤트 처리를 위한 인터페이스

public class KeyMouseEvent extends JApplet implements MouseListener, MouseMotionListener, KeyListener{
	private int x, y; //이미지를 출력할 x, y 좌표값
	private int width, height; //가로, 세로 사이즈
	private Image img; //이미지 car.gif 사용할 변수
	private boolean flag = false; //이미지가 처음 실행할 때는 안보이게끔 하기 위해 불린값으로 false로 처리
	
	@Override
	public void init() {
		setSize(300,300);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		
		//현재클래스의 마우스 이벤트 기능을 추가
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		setFocusable(true); //키를 입력받을 수 있도록 설정
		requestFocus();//현재 화면에 키 입력을 요청
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로, 세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+ "," +height);
		
		if(flag) { //마우스를 클릭 시 true로 바뀌게 설정
			g.drawImage(img, x, y, this);
			//drawImage(이미지, x, y, 이미지 관찰자);
		}
	}//end paint
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 입력하면 호출
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키가 눌려져 있을 때 호출
		System.out.println(e.getKeyCode()); //키 코드값
		System.out.println(e.getKeyChar()); //문자
		switch (e.getKeyCode()) { //키 코드값에 따라 분기
		case KeyEvent.VK_UP: //위쪽 화살표를 눌렀을 때
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN: //아래쪽 화살표를 눌렀을 때
			y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT: //왼쪽 화살표를 눌렀을 때
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT: //오른쪽 화살표를 눌렀을 때
			x=Math.min(300-width, x+5); break;
		}
		repaint(); //그래픽 갱신요청
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse drag : x:" + x + ", y:"+ y);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// 마우스 커서가 컴포넌트상에서 이동했지만 버튼이 작동하지 않은 경우에 호출
		x = e.getX();
		y = e.getY();
		System.out.println("Mouse move : x:" + x + ", y:"+ y);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//컴포넌트 상에서 마우스 버튼을 클릭(눌렀다가 뗄때) 했을 때 호출
		flag=true; //클릭할 때 그림을 ture로 설정해서 보여지게함
		//마우스 클릭한 좌표저장
		x = e.getX();
		y = e.getY();
		
		repaint(); //그래픽 갱신 요청 =>paint() 자동 호출됨
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스 버튼을 누를 때 호출
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 컴포넌트 상에서 mouse 버튼을 떼고 완전히 놓아지면 호출
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 컴포넌드 안에 들어갈 때에 호출
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 컴포넌트 안에서 빠져 나올 때 
		
	}

	
}
