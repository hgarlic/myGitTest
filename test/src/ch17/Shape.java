package ch17;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Shape extends JApplet{
	@Override
	public void init() {
		setSize(300,300);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(5)); //선 굵기 조절
		g.drawLine(10, 10, 200, 10); // 선 긋기
		
		g.setColor(Color.YELLOW); //색상
		g2.setStroke(new BasicStroke(1)); 
		g.drawRect(120, 40, 90, 55); //사각형
		
		g.setColor(Color.CYAN);
		g.fillRect(120, 140, 90, 55);
		
		g.setColor(Color.red);
		//fillRoundRect(x좌표, y좌표, 가로, 세로, 가로라운드길이, 세로라운드길이값)
		g.fillRoundRect(120, 240, 90, 55, 10, 10);
		
		g.setColor(Color.blue);
		g.drawOval(0, 40, 90, 55);
		
		g.setColor(Color.pink);
		g.fillOval(0, 140, 90, 55);

		int[] x = {10,30,50,40,20};
		int[] y = {257, 240, 257, 280, 280};
		//fillPolygon(x배열값, y배열값, 꼭지점의 수)
		g.fillPolygon(x,y,x.length); //다각형 그리기
	
	}
}
