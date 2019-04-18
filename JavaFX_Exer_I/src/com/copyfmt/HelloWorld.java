package com.copyfmt;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorld {
	public static void main(String[] args) {
		JFrame window = new JFrame("JFrame GUI");
		JPanel panel = new JPanel();
		JLabel lblHello = new JLabel("Hello World");
		panel.add(lblHello);
		window.setContentPane(panel);
		window.setSize(400, 200);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
