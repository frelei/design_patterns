package com.pattern.decorator;

public abstract class Decorator implements Sorvete{

	protected Sorvete sorvete;
	
	public Decorator(Sorvete sorvete){
		this.sorvete = sorvete;
	}
	
	@Override
	public  String descricao(){
		return sorvete.descricao();
	}
	

	@Override
	public double custo(){
		return sorvete.custo();
	}

}
