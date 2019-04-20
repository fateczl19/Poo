package com.copyfmt;

public class Run {

	public static void main(String[] args) {
		Leitor zapa = new Leitor();
		zapa.setName("zapa");

		Leitor renato = new Leitor();
		renato.setName("renato");

		Leitor daniel = new Leitor();
		daniel.setName("daniel");

		Leitor gustavo = new Leitor();
		gustavo.setName("gustavo");

		String artigo = "Fatec ZL faz parceria com o " + "MIT para desenvolvimento de novas tecnologias";
		SuperInteressante s = new SuperInteressante();

		s.registrar(zapa);
		s.registrar(daniel);
		s.registrar(renato);
		s.registrar(gustavo);

		s.publicarArtigo(artigo);
	}
}
