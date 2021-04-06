package br.com.faculdadedelta.modelo;

import br.com.faculdadedelta.generico.Movel;

public class Mesa implements Movel{

	@Override
	public void locar(String texto) {
		System.out.println("Mesa Locada " + texto);
		
	}

	@Override
	public void devolucao(String texto) {
		System.out.println("Mesa Devolvida " + texto);
		
	}

	@Override
	public void list(String texto) {
		// TODO Auto-generated method stub
		
}

}
