package com.thales.graphinterface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceOne {

	public static void main(String[] args) {
		// Cria os elementos gráficos (janela, painel e objeto)
		JFrame janela = new JFrame("Minha primeira janela gráfica");
		JPanel painel = new JPanel();
		JLabel lblHello = new JLabel("Eu Gosto de Java...");
		// Conecta os elementos
		painel.add(lblHello);
		janela.setContentPane(painel);
		// Mostra uma janela gráfica
		janela.setSize(400, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
