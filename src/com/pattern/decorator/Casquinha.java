package com.pattern.decorator;

public class Casquinha implements Sorvete{

	@Override
	public String descricao() {
		return "Saindo uma casquinha";
	}

	@Override
	public double custo() {
		System.out.println("Casquinha custa 1");
		return 1.00;
	}

	
}
