package com.thales.events;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teste {
	public static void main(String[] args){
		JFrame janela = new JFrame("Janela de Teste");
		JPanel painel = new JPanel();
		JButton btnSair = new JButton("                    Sair                    ");
		JLabel lblOla = new JLabel("Olá....!!!!");
		
		painel.add(lblOla);
		painel.add(btnSair);
		janela.setContentPane(painel);
		
		Evento ouv = new Evento();
		btnSair.addActionListener(ouv);
		
		janela.setSize(200, 150);
		janela.setVisible(true);
	}
}
