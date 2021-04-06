package br.com.faculdadedelta.main;

import java.util.Scanner;

import br.com.faculdadedelta.generico.EnumTipoMovel;
import br.com.faculdadedelta.generico.Movel;
import br.com.faculdadedelta.modelo.CriarMovel;
import br.com.faculdadedelta.negocio.LocacaoMoveis;

public class MainLocacaoMoveis {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("-------------Bem Vindo à nossa loja de aluguel de moveis-------------");
		System.out.println("Escolha uma das opções para prosseguirmos:");
		System.out.println("1: Para Locação e 2: Para Devolução");
		int op = sc.nextInt();
		if (op == 1) {
			
		} else if (op == 2) {
			System.out.println("Escolha uma das opçoẽs para devolução:");
			System.out.println("1: Para Mesa /n 2: Para Cadeira /n 3: Para Armario");
		}else {
			
		} */
		CriarMovel factory = new CriarMovel();
		LocacaoMoveis lm = new LocacaoMoveis();
		
		

		
		Movel movel = factory.criarMovel(EnumTipoMovel.ARMARIO);
		lm.setMovel(movel);
		lm.getMovel().locar("Com Sucesso");
		lm.getMovel().devolucao("Com Sucesso");
		Movel movel1 = factory.criarMovel(EnumTipoMovel.CADEIRA);
		lm.setMovel(movel1);
		lm.getMovel().locar("Com Sucesso");
		lm.getMovel().devolucao("Com Sucesso");
		Movel movel2 = factory.criarMovel(EnumTipoMovel.MESA);
		lm.setMovel(movel2);
		lm.getMovel().locar("Com Sucesso");
		lm.getMovel().devolucao("Com Sucesso");
	}

}
