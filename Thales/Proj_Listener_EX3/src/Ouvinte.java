import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

public class Ouvinte implements ActionListener{

	private JTextField display;
	private String ultNum, atualNum, ultOp;
	
	public Ouvinte(JTextField display) {
		this.display = display;
		this.ultNum = "";
		this.atualNum = "";
		this.ultOp = "";
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();
		
		switch(btn.getText()) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "0":
			case ".":
				atualNum += btn.getText();
				this.display.setText(atualNum);
				break;
			case "+":
			case "-":
			case "/":
			case "*":
				this.display.setText("");
				if(ultOp.equals("")) {
					ultOp = btn.getText();
					ultNum = atualNum;
					atualNum = "";
					this.display.setText(atualNum);
				}else {
					ultNum = Float.toString(realizaCalc());
					ultOp = btn.getText();
					atualNum = "";
				}
				break;
			case "=":
				this.display.setText(Float.toString(realizaCalc()));
				break;
			default:
				ultNum = "";
				atualNum = "";
				ultOp = "";
				this.display.setText("0");
		}
			
	}
	
	private float realizaCalc() {
		if(!ultNum.equals("") && !atualNum.equals("")) {
			float vl1 = Float.parseFloat(ultNum);
			float vl2 = Float.parseFloat(atualNum);
			
			switch(ultOp) {
				case "+":
					return vl1 + vl2;
				case "-":
					return vl1 - vl2;
				case "/":
					return vl1 / vl2;
				case "*":
					return vl1 * vl2;
			}
			
		}else {
			if(!ultNum.equals("")) {
				return Float.parseFloat(ultNum);
			}else
			if(!atualNum.equals("")) {
				return Float.parseFloat(atualNum);
			}
		}
		return 0;
	}

}
