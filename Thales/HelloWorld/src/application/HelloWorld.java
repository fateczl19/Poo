package application;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorld {

	public static void main(String[] args) {
		// Cria os elementos gr�ficos (janela, painel e objeto)
		JFrame janela = new JFrame("Hello World");
		JPanel painel = new JPanel();
		JLabel lblHello = new JLabel("Hello World");
		// Conecta os elementos
		painel.add(lblHello);
		janela.setContentPane(painel);
		// Mostra uma janela gr�fica
		janela.setSize(400, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
