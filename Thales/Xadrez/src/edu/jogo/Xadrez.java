package edu.jogo;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Xadrez {
	
	private JFrame janela;
	private JPanel panPrincipal;
	private Tabuleiro panTab = new Tabuleiro();
	
	public Xadrez() { 
		File f = new File(".");
		System.out.println(f.getAbsolutePath());
		janela = new JFrame("X A D R E Z");
		panPrincipal = new JPanel(new BorderLayout());
		janela.setContentPane( panPrincipal );
		
		panPrincipal.add( panTab, BorderLayout.CENTER );
		
		janela.setSize(800, 600);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void jogar() { 
		while (true) { 
			panTab.repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Xadrez().jogar();
	}
}
