package com.copyfmt;

import java.util.ArrayList;

public class SuperInteressante implements Revista, Subject {
	private ArrayList<Observer> leitores = new ArrayList<>();
	
	public SuperInteressante() {}
	
	private String artigo;
	public void publicarArtigo(String artigo) {
		this.artigo = artigo;
		notificar();
	}

	@Override
	public void notificar() {
		try {
			for (Observer o : this.leitores) {
				o.update(this);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void registrar(Observer o) {
		this.leitores.add(o);
	}

	@Override
	public String artigo() {
		return this.artigo;
	}
}
