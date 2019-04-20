package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
	public void ConsultWord(String palavra){
		Map<String, String> palavras = new HashMap<>();
		
		palavras.put("Ac�falo", "falta de intelig�ncia");
		
		if (palavras.containsKey(palavra)) {
			System.out.println(palavra+": ");
		}else{
			Scanner what = new Scanner(System.in);
			System.out.println("Palavra n�o localizada, informe o siginificado:");
			String sign = what.nextLine();
			palavras.put(palavra, sign);
			System.out.println(palavra+": ");
		}
		System.out.println(palavras.get(palavra));
		
	}
	
}
