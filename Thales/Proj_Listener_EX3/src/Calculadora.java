import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {
	private JFrame janela;
	
	public Calculadora() {
		
		janela = new JFrame("Calculadora");
		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout());
		
		JTextField txtCalc = new JTextField(15);
		txtCalc.setEnabled(false);
		txtCalc.setText("0");
		
		Ouvinte o = new Ouvinte(txtCalc);
		JButton btnCalc = new JButton("CE");
		btnCalc.addActionListener(o);
		
		JPanel pnlEntrada = new JPanel();
		pnlEntrada.setLayout(new FlowLayout());
		pnlEntrada.add(txtCalc);
		pnlEntrada.add(btnCalc);
		panel.add(pnlEntrada, BorderLayout.NORTH);
		
		JPanel pnlNumeros = new JPanel();
		pnlNumeros.setLayout(new GridLayout(4, 4));
		
		
		JButton btn = new JButton("1");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("2");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("3");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("+");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("4");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		
		btn = new JButton("5");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("6");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("-");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("7");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("8");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("9");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("*");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton(".");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("0");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("=");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		btn = new JButton("/");
		btn.addActionListener(o);
		pnlNumeros.add(btn);
		
		panel.add(pnlNumeros, BorderLayout.SOUTH);
		
		janela.setContentPane(panel);
		janela.setSize(250, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
