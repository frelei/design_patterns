package com.pattern.observer;

public class CorretoraA implements Observer{

	private int valor_acao;
	private Subject bolsaValores;
	
	
	public CorretoraA(Subject bolsa){
		this.bolsaValores = bolsa;
		/*
		 * Adiciona CorretoraA a lista de Observers 
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
		if(valor_acao <= 3000)
			System.out.println("Corretora A: COMPRA AÇÃO, valor: "+valor_acao);
		else
			System.out.println("Corretora A: Muito cara, valor: "+valor_acao);
	}
}
