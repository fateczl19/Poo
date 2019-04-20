package application;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Drawing extends JPanel {
	public void paint(Graphics g){
		int x1 		= 300;
		int y1 		= 100;
		int height1 = 150;
		int width1 	= 200;
		
		
		g.drawRect(100, 100, 100, 150);
		g.drawLine(150, 50, 200, 100);
		g.drawLine(150, 50, 100, 100);
		
		for (int i = 0; i < 100; i++) {
			g.drawOval(x1, y1, width1, height1);
			x1+=2;
			y1+=2;
			height1-=4;
			width1-=4;
			

		}
	}		
}
