package com.copyfmt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cadastro {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cadastro Exercicio 2");
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblPhoneNumber = new JLabel("phone number:");
		lblPhoneNumber.setLocation(20, 10);
		lblPhoneNumber.setSize(lblPhoneNumber.getPreferredSize().width,
				lblPhoneNumber.getPreferredSize().height);
		
		JTextField txtPhoneNumber = new JTextField();
		txtPhoneNumber.setLocation(
				lblPhoneNumber.getLocation().x + lblPhoneNumber.getWidth() + 15,
				lblPhoneNumber.getLocation().y);
		txtPhoneNumber.setSize(150,
				txtPhoneNumber.getPreferredSize().height);
		
		JLabel lblName = new JLabel("name:");
		lblName.setLocation(20, 40);
		lblName.setSize(lblName.getPreferredSize().width,
				lblName.getPreferredSize().height);
		
		JTextArea txtName = new JTextArea();
		txtName.setLocation(
				lblName.getLocation().x + lblName.getWidth() + 15,
				lblName.getLocation().y);
		txtName.setSize(200,
				100);
		txtName.setLineWrap(true);
		
		JButton btnOK = new JButton("Ok");
		btnOK.setSize(150, btnOK.getPreferredSize().height);
		btnOK.setLocation(txtName.getLocation().x - 50, txtName.getLocation().y + 110);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setSize(150, btnOK.getPreferredSize().height);
		btnCancel.setLocation(btnOK.getLocation().x + 150, txtName.getLocation().y + 110);
		
		panel.add(lblPhoneNumber);
		panel.add(lblName);
		panel.add(txtPhoneNumber);
		panel.add(txtName);
		panel.add(btnOK);
		panel.add(btnCancel);
		
		frame.setContentPane(panel);
		frame.setSize(400, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}