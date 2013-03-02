package com.pattern.decorator;

public class Chocolate extends Decorator{

	public Chocolate(Sorvete sorvete) {
		super(sorvete);
		System.out.println("Adicionado Sorvete Chocolate");
	}

	public String descricao(){
		return sorvete.descricao() + ", Chocolate";
	}
	
	public double custo(){
		return sorvete.custo() + 1.1;
	}
	
}
