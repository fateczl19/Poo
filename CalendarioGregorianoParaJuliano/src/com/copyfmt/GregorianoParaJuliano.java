package com.copyfmt;

public class GregorianoParaJuliano {

	public int gregorianoParaJuliano(int dia, int mes, int ano) {
		double dataju = 0;
		double a, b, c, d, e;
		
		int data = dia + mes + ano;
		int base = 15 + 10 + 1582;

		if (mes < 3) {
			ano -= 1;
			mes += 12;
		}

		if (data >= base) {
			a = ano / 100;
			b = a / 4;
			c = 2 - a + b;
			d = 365.25 * (ano + 4716);
			e = 30.6001 * mes + 1;
			dataju = (d + e + dia + 0.5 + c - 1524.5) + 30;
		}
		if (dataju % 1 == 0) {
			dataju -= 1;
		}

		return (int) dataju;
	}

	public static void main(String[] args) {
		GregorianoParaJuliano gTJ = new GregorianoParaJuliano();
		System.out.println(gTJ.gregorianoParaJuliano(5, 8, 2016));
	}
}
