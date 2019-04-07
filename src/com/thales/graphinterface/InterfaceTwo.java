package com.thales.graphinterface;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfaceTwo {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Graphic User Interface Test");
		JPanel painel = new JPanel();
		
		JLabel lblNumber = new JLabel("Enter your phone number: ");
		JLabel lblName = new JLabel("Enter your name: ");
		JTextField txtNumber = new JTextField(20);
		JTextArea txtName = new JTextArea(4, 25); 
		JButton buttonOk = new JButton("OK");
		JButton buttonCancel = new JButton("Cancel");
		
		// Conecta os elementos
		painel.add(lblNumber);
		painel.add(txtNumber);
		painel.add(lblName);
		painel.add(txtName);
		painel.add(buttonOk);
		painel.add(buttonCancel);
		janela.setContentPane(painel);
		// Mostra uma janela gráfica
		janela.setSize(400, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
