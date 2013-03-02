package com.pattern.decorator;

public class Baunilha extends Decorator{

	public Baunilha(Sorvete sorvete) {
		super(sorvete);
		System.out.println("Adicinando Sorvete Baunilha");
	}
	
	public String descricao(){
		return sorvete.descricao() + ", Baunilha";
	}
	
	public double custo(){
		return sorvete.custo() + .7;
	}

}
