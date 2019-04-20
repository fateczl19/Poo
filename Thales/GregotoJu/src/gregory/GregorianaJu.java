package gregory;

import java.util.Scanner;

public class GregorianaJu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o dia");
		int day = scan.nextInt();
		
		System.out.println("Digite o mês");
		int month = scan.nextInt();
		
		System.out.println("Digite o ano");
		int year = scan.nextInt();
		
		Helper help = new Helper();
		
		System.out.println(day + " de " + month + " de" + 
		" " + year + " em gregoriano, fica " + help.GregoriantoJulian(day, month, year)
		+ " em Juliano");
		
	}

}