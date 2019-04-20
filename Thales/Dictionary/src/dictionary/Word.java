package dictionary;
import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Dictionary dic 		= new Dictionary();
		
		Scanner word 	= new Scanner(System.in);
		
		System.out.println("Informe uma palavra:");
		String w 		= word.nextLine();
		
		dic.ConsultWord(w);
	}

}
