package br.com.faculdadedelta.negocio;

import br.com.faculdadedelta.generico.Movel;

public class LocacaoMoveis {
	
	private Movel movel;
	

	public LocacaoMoveis() {

	}

	public Movel getMovel() {
		return movel;
	}

	public void setMovel(Movel movel) {
		this.movel = movel;
	}
	
	public void list(String texto) {
		getMovel().list("Operação Sucesso");
	}
	
}
