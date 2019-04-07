package com.thales.banco;

import java.util.Date;

public class Conta {
	double saldo;
	String numero;
	String senha;
	Transacao historico = new Transacao();
	
	public boolean efetuarSaque(double valor){
		System.out.println("Realizando Saque");
		return true;
	}
	
	public boolean efetuarDeposito(double valor){
		System.out.println("Realizando Depósito");
		return true;
	}
	
	public boolean efetuarPagamento(String boleto, double valor){
		System.out.println("Efetuando pagamento");
		return true;
	}
	
	public Transacao extrato(Date dataInicio, Date dataFinal){
		return historico;
	}
	
}
