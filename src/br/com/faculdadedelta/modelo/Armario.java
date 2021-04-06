package br.com.faculdadedelta.modelo;

import br.com.faculdadedelta.generico.Movel;

public class Armario implements Movel{

	@Override
	public void locar(String texto) {
		System.out.println("Armario Locado " + texto);
		
	}

	@Override
	public void devolucao(String texto) {
		System.out.println("Armario Devolvido " + texto);
		
	}

	@Override
	public void list(String texto) {
		// TODO Auto-generated method stub
		
	}


}
