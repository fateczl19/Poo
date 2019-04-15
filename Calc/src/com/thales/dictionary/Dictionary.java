package com.thales.dictionary;

import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		Words dic 		= new Words();
		
		Scanner word 	= new Scanner(System.in);
		
		System.out.println("Informe uma palavra:");
		String w 		= word.nextLine();
		
		dic.ConsultWord(w);
	}

}
