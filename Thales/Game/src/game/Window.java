package game;
import javax.swing.JFrame;

public class Window extends JFrame{

	private Personagem personagem;
	public Window() {
		setTitle("Movimentando o Personagem");
		setSize(640, 480);
		setResizable(false);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		personagem = new Personagem();

		setContentPane(personagem);
		setVisible(true);
		
		
	}
}
