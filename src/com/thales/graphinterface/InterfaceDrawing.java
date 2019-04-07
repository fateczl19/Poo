package com.thales.graphinterface;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceDrawing{

	public static void main(String[] args) {
		JFrame janela = new JFrame();
		Drawing pintura = new Drawing();
		
		janela.setContentPane(pintura);
		
		janela.setSize(400, 500);
		janela.setVisible(true);

	}
	
	

}
