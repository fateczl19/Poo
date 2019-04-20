package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Personagem extends JPanel implements ActionListener, KeyListener {

	Timer t = new Timer(1, this);
	private double x = 0, y = 0, moveX = 0, moveY = 0;
	private Graphics2D graphics;
	
	
	public Personagem() {

		t.start();
		this.x = 280;
		this.y = 180;
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);
		
		graphics = (Graphics2D) g;
		graphics.fill(new Ellipse2D.Double(x, y, 40, 40));

	}

	@Override
	public void keyPressed(KeyEvent e) {

		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP || code == KeyEvent.VK_W) {
			t.restart();
			cima();
		}
		if (code == KeyEvent.VK_DOWN || code == KeyEvent.VK_S) {
			t.restart();
			baixo();
		}
		if (code == KeyEvent.VK_LEFT || code == KeyEvent.VK_A) {
			t.restart();
			esq();
		}
		if (code == KeyEvent.VK_RIGHT || code == KeyEvent.VK_D) {
			t.restart();
			dir();
		}
		/*
		 * if (code == KeyEvent.VK_UP && code == KeyEvent.VK_LEFT) { cima_esq(); } if
		 * (code == KeyEvent.VK_UP && code == KeyEvent.VK_RIGHT) { cima_dir(); } if
		 * (code == KeyEvent.VK_DOWN && code == KeyEvent.VK_LEFT) { baixo_esq(); } if
		 * (code == KeyEvent.VK_DOWN && code == KeyEvent.VK_RIGHT) { baixo_dir(); }
		 */

	}

	@Override
	public void keyReleased(KeyEvent e) {

		t.stop();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		restricao();
		x += moveX;
		y += moveY;
	}

	private void cima() {
		moveY = -1.5;
		moveX = 0;
	}

	private void baixo() {
		moveY = 1.5;
		moveX = 0;
	}

	private void esq() {
		moveY = 0;
		moveX = -1.5;
	}

	private void dir() {
		moveY = 0;
		moveX = 1.5;
	}

	public void restricao() {

		if (this.x < 2) {
			x = 2;
		}
		if (this.x > 590) {

			x = 590;
		}
		if (this.y < 0) {

			y = 0;

		}
		if (this.y > 410) {

			y = 410;

		}

	}

	/*
	 * private void cima_esq() { moveY = -1.5; moveX = -1.5; } private void
	 * cima_dir() { moveY = -1.5; moveX = 1.5; } private void baixo_esq() { moveY =
	 * 1.5; moveX = -1.5; } private void baixo_dir() { moveY = 1.5; moveX = 1.5; }
	 */

}
