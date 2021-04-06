package br.com.faculdadedelta.modelo;

import br.com.faculdadedelta.generico.Movel;

public class Cadeira implements Movel{

	@Override
	public void locar(String texto) {
		System.out.println("Cadeira Locada " + texto);
		
	}

	@Override
	public void devolucao(String texto) {
		System.out.println("Cadeia Devolvida " + texto);
		
	}

	@Override
	public void list(String texto) {
		// TODO Auto-generated method stub
		
	}

}
