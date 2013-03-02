package com.pattern.decorator;

public class Sundae implements Sorvete{

	@Override
	public String descricao() {
		return "Saindo um Sundae ";	
	}

	@Override
	public double custo() {
		return 2.00;
	}
}
