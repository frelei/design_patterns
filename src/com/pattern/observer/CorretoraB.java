package com.pattern.observer;

public class CorretoraB implements Observer {

	private int valor_acao;
	private Subject bolsaValores;
	
	
	public CorretoraB(Subject bolsa){
		this.bolsaValores = bolsa;
		/*
		 * Adiciona CorretoraB a lista de Observers 
		 * do subject
		 * 
		 */
		this.bolsaValores.addObserver(this);
	}
	
	@Override
	public void update(int value) {
		this.valor_acao = value;
		decisao();
	}

	public void decisao(){
		if(valor_acao <= 100 )
			System.out.println("corretora B, compra acao por valor: "+valor_acao);
		else
			System.out.println("corretora B, Nem Pensar por valor: "+valor_acao);
	}
}
