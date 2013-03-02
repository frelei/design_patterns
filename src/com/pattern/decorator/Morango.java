package com.pattern.decorator;

public class Morango extends Decorator{

	public Morango(Sorvete sorvete) {
		super(sorvete);
		System.out.println("Adicionando Sorvete Morango");
	}
	
	public String descricao(){
		return sorvete.descricao() + ", Morango";
		
	}
	
	public double custo(){
		return  sorvete.custo() + .5;
	}
}
