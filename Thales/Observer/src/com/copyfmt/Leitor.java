package com.copyfmt;

public class Leitor implements Observer{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Revista r) {
		System.out.println(this.name + " Esta lendo o artigo " + r.artigo());
	}

}
