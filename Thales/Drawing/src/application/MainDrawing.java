package application;

import javax.swing.JFrame;


public class MainDrawing {
	public static void main(String[] args) {
		JFrame janela = new JFrame();
		Drawing pintura = new Drawing();
		
		janela.setContentPane(pintura);
		
		janela.setSize(700, 500);
		janela.setVisible(true);

	}
}
