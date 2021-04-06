package br.com.faculdadedelta.modelo;

import br.com.faculdadedelta.generico.EnumTipoMovel;
import br.com.faculdadedelta.generico.Movel;

public class CriarMovel {
	
	public Movel criarMovel(EnumTipoMovel tmMovel) {
		if(tmMovel == EnumTipoMovel.ARMARIO) {
			return new Armario();
		} else if(tmMovel == EnumTipoMovel.CADEIRA) {
			return new Cadeira();
		} else {
			return new Mesa();
		}
	
	}
	
}

