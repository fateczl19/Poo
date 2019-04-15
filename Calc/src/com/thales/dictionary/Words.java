package com.thales.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Words {
	public void ConsultWord(String palavra){
		Map<String, String> palavras = new HashMap<>();
		
		palavras.put("Amor", "Algo muito louco");
		
		if (palavras.containsKey(palavra)) {
			System.out.println(palavra+": ");
		}else{
			Scanner what = new Scanner(System.in);
			System.out.println("Palavra não localizada, informe o siginificado:");
			String sign = what.nextLine();
			palavras.put(palavra, sign);
			System.out.println(palavra+": ");
		}
		System.out.println(palavras.get(palavra));
		
	}
	
}
